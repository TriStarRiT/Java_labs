import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        System.out.println("===========Задание 1=============");
        List<String> mass= Arrays.asList("February","March","April","May","July","Autumn","October","November","March","November","December","March","June","July","April","January","September","October","April","March");

        Map < String, Long > wordsByCount = mass.stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        String prevalentWord = wordsByCount.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(prevalentWord);

        System.out.println("===========Задание 2=============");
        List<Worker> worker = Data.data();

        OptionalDouble a=worker.stream().mapToInt(p-> p.getSalary()).average();
        double b=a.orElse(-1);
        System.out.println("Средняя зарплата сотрудников составляет "+b);


        System.out.println("===========Задание 3=============");
        int N=4;
        List<Worker> worker3 = worker.stream()
                .sorted((o1,o2)->-o1.compareTo(o2))
                .limit(N)
                .collect(Collectors.toList());
        System.out.print(N+" самых старших сотрудников зовут: ");
        for (int i=0; i<worker3.size();i++){
            System.out.print(worker3.get(i).re());
        }


    }
}