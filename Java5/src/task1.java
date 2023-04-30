import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class task1 {
    public static void task1(){
        String[] mas = new String[] {"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь","Январь","Февраль","Март","Апрель","Май","Июнь","Июль"};
        LinkedList<String> list = new LinkedList<>(Arrays.asList(mas));
        LinkedHashSet<String> hashSet = new LinkedHashSet<String>(list);
        for(String str : hashSet)
            System.out.println(str);
        List<String> hList = new ArrayList<>();;
        for(String str : hashSet)
            hList.add(str);
        Integer[] num = new Integer[hList.size()];
        for(int i=0;i<hList.size();i++){
            num[i]=0;
        }
        for (int i=0;i< hList.size();i++){
            for(int j=0;j< mas.length;j++){
                if (list.get(j)==hList.get(i)){
                    num[i]=num[i]+1;
                }
            }
        }
        for(int i=0;i<hList.size();i++) {
            System.out.println(hList.get(i)+" - "+num[i]);
        }
    }
}
