
public class Main {
    public static void main(String[] args) {
        mas1();
        mas2();
    }
    public static void mas1(){
        float[] Array1 = new float[10000000];
        for (int i=0; i< Array1.length;i++){
            Array1[i]=1;
        }
        long a = System.currentTimeMillis();
        for (int i=0; i<Array1.length;i++){
            Array1[i] = (float)(Array1[i] * Math . sin (0.2f + i / 5) * Math.cos (0.2f + i / 5) * Math . cos (0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis()-a);
    }
    public static void mas2(){
        float[] Array1 = new float[10000000/2];
        float[] array11 = new float[10000000/2-1];
        for (int i=0; i<Array1.length;i++){
            Array1[i]=1;
        }
        for (int i=0; i<array11.length;i++){
            array11[i]=1;
        }


        long a = System.currentTimeMillis();
        MyThread myThread = new MyThread(array11);
        myThread.start();
        MyThread2 myThread2 = new MyThread2(Array1);
        myThread2.start();
        array11=MyThread.getTemp();
        Array1=myThread2.getTemp();
        System.out.println(System.currentTimeMillis() - a);
    }
}



class MyThread extends Thread{
    private static float[] array = new float[5000000];

    public MyThread(float[] array){
        this.array = array;
    }
    @Override
    public void run(){
        for (int i=0; i<array.length;i++){
            array[i] = (float)(array[i] * Math . sin (0.2f + i / 5) * Math.cos (0.2f + i / 5) * Math . cos (0.4f + i / 2));
        }
        return;
    }
    public static float[] getTemp(){
        return array;
    }
}

class MyThread2 extends Thread{
    private static float[] array = new float[5000000];

    public MyThread2(float[] array){
        this.array = array;
    }
    @Override
    public void run(){
        for (int i=0; i<array.length;i++){
            array[i] = (float)(array[i] * Math . sin (0.2f + i / 5) * Math.cos (0.2f + i / 5) * Math . cos (0.4f + i / 2));
        }
        return;
    }
    public static float[] getTemp(){
        return array;
    }
}