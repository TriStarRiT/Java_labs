import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.function.Function;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        System.out.println("===========Задание 1=============");
        List<String> mass= Arrays.asList("February","March","April","May","July","Autumn","October","November","March","November","December","March","June","July","April","January","September","October","April","March");
        String[] array={"February","March","April","May","July","Autumn","October","November","March","November","December","March","June","July","April","January","September","October","April","March"};

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


        List<Worker> worker2 = worker.stream()
                .filter(p->p.getAge()>30)
                .collect(Collectors.toList());


        for (int i=0; i<worker2.size();i++){
            System.out.println(worker2.get(i));
        }


    }
}