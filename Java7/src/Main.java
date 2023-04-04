/*public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class Main {
    public static CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
    public static CyclicBarrier cyclicBarrier2 = new CyclicBarrier(4);
    public static Semaphore semaphore = new Semaphore(2);
    public static Semaphore semaphore2 = new Semaphore(1);
    public static Lock lock = new ReentrantLock();
    public static String winner="";
    public static CountDownLatch cdl = new CountDownLatch(4);
    public static CountDownLatch cd1 = new CountDownLatch(4);
    public static final int CARS_COUNT = 4;
    public static void main (String[] args)
    {
        System.out.println( "ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!" );
        Race race = new Race( new Road( 60) , new Tunnel(), new Road( 40)) ;
        Car[] cars = new Car[CARS_COUNT];
        for ( int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + ( int ) (Math.random() * 10)) ;
    }
        for ( int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        /*ExecutorService executionService = Executors.newFixedThreadPool(4);
        for ( int i = 0; i < cars.length; i++) {
            executionService.submit(new Thread(cars[i]));
        }*/
        try {
            Main.cd1.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println( "ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!" );

        try {
            Main.cdl.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //CyclicBarrier cyclicBarrier = new CyclicBarrier(4, );
        System.out.println( "ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!" );
    }
}
