import java.util.ArrayList;

public class ArrayToList {
    public static void ArrayToList(int mas[]){
        ArrayList list = new ArrayList();
        for (int i=0;i<mas.length;i++){
            list.add(mas[i]);
        }
    }
}
