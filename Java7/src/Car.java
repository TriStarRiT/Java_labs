import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.*;

public class Car implements Runnable {
    private static int CARS_COUNT;

    static {
        CARS_COUNT = 0;
    }


    private Race race;
    private int speed;
    private String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int
            speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
        }
         catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Main.cyclicBarrier.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        Main.cd1.countDown();
        for (
                int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        if (Main.winner==""){
            System.out.println("Победитель:"+this.name);
            Main.winner=this.name;
        }
        Main.cdl.countDown();
    }
}
