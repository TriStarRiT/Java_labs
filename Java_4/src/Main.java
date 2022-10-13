import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        int [] mas = new int[] {1,2,3};
        System.out.println("===============Задание 1===============");
        Change.Change(mas);
        System.out.println("===============Задание 2===============");
        ArrayToList.ArrayToList(mas);

        Orange orange1 = new Orange(2);
        Apple apple1 = new Apple(3);

        /*ArrayList<Apple> appleBox = new ArrayList();
        ArrayList<Orange> orangeBox = new ArrayList();*/
        Box appleBox = new Box();
        Box orangeBox = new Box();
    }
}