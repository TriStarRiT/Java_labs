import java.util.Scanner;

public class Change {
    public static void Change(int mas[]){
        Scanner scan  = new Scanner(System.in);

        System.out.println("Введите первый номер ячейки которую хотите поменять");
        int i1 = Integer.parseInt(scan.nextLine());
        System.out.println("Введите второй номер ячейки которую хотите поменять");
        int i2 = Integer.parseInt(scan.nextLine());

        int k = mas[i2-1];
        mas[i2-1]=mas[i1-1];
        mas[i1-1]=k;

        for (int i=0;i<mas.length;i++){
            System.out.println(mas[i]);
        }
    }
}
