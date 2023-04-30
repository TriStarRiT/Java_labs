import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import  java.util.Scanner;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        //task1.task1();

        TreeMap<String, Tel> map = new TreeMap<>(/*Comparator.comparing(o->o.name)*/);
        Tel tel1= new Tel("Sergey", 1);
        Tel tel2= new Tel("Bob",2);
        Tel tel3= new Tel("Andrey", 3);
        Tel tel4= new Tel("Ivan", 4);
        Tel tel5= new Tel("John", 5);
        Tel tel6= new Tel("Alexey", 6);
        Tel tel7= new Tel("Sergey", 7);
        Tel tel8= new Tel("Vlodimir", 8);
        map.put(tel1.getName1(),tel1);
        List<Tel> list=new ArrayList();
        List<Tel> delList=new ArrayList();
        list.add(tel1);
        list.add(tel2);
        list.add(tel3);
        list.add(tel4);
        list.add(tel5);
        list.add(tel6);
        list.add(tel7);
        list.add(tel8);
        for (int i=0;i< list.size();i++){
            for(int j=i+1;j< list.size();j++){
                if(list.get(i).getName1()==list.get(j).getName1()){
                    delList.add(list.get(i));
                }
            }
            add(list.get(i),map);
        }
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя для поиска: ");
        String name = console.nextLine();
        get(name,map, delList);


    }
    static void add(Tel tel, TreeMap map){
        map.put(tel.getName1(),tel);;
    }
    static void get(String name, TreeMap map, List delList) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz=map.get(name).getClass();
        Method getTel=clazz.getDeclaredMethod("getTel");
        getTel.invoke(map.get(name));
        Method getName1=clazz.getDeclaredMethod("getName1");
        String name1= getName1.invoke(map.get(name)).toString();
        for (int i=0;i< delList.size();i++){
            Class clazz2=delList.get(i).getClass();
            Method getName2=clazz2.getDeclaredMethod("getName1");
            String name2= getName2.invoke(delList.get(i)).toString();
            if(name1==name2){
                Method getTel2=clazz2.getDeclaredMethod("getTel");
                getTel.invoke(delList.get(i));
            }
        }
    }
}