import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        int [] mas = new int[] {1,2,3};
        System.out.println("===============Задание 1===============");
        //Change.Change(mas);
        System.out.println("===============Задание 2===============");
        //ArrayToList.ArrayToList(mas);
        System.out.println("===============Задание 3===============");
        double OrangeWeight = 1.5;
        double AppleWeight = 1;

        Orange orange1 = new Orange(OrangeWeight);
        Orange orange2 = new Orange(OrangeWeight);
        Orange orange3=new Orange(OrangeWeight);

        Apple apple1 = new Apple(AppleWeight);
        Apple apple2 = new Apple(AppleWeight);
        Apple apple3 = new Apple(AppleWeight);
        Apple apple4 = new Apple(AppleWeight);

        ArrayList<Apple> appleArray = new ArrayList();
        appleArray.add(apple1);
        appleArray.add(apple2);
        appleArray.add(apple3);

        ArrayList<Orange> orangeArray = new ArrayList();
        orangeArray.add(orange1);
        orangeArray.add(orange2);

        Box<Apple> appleBox1 = new Box<>(appleArray,AppleWeight);
        appleArray.clear();
        appleArray.add(apple4);
        Box<Apple> appleBox2 = new Box<>(appleArray,AppleWeight);

        Box<Orange> orangeBox1 = new Box<>(orangeArray,OrangeWeight);
        orangeArray.clear();
        orangeArray.add(orange3);
        Box<Orange> orangeBox2 = new Box<>(orangeArray,OrangeWeight);

        double a=appleBox1.getWeight();
        double b=orangeBox1.getWeight();

        System.out.println(a);
        System.out.println(b);

        appleBox1.Compare(orangeBox1);

        appleBox1.change(appleBox2);
    }
}