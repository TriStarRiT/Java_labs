import java.util.List;

public class Main {
    public static void main(String[] args) {
        Man man1 = new Man("Bob",150,10);
        Cat cat1 = new Cat("Barsik",120,5);
        Bot bot1 = new Bot("Bot",200,1);

        System.out.println("========================Задание 1========================");
        man1.run();
        man1.jump();

        cat1.run();
        cat1.jump();

        bot1.run();
        bot1.jump();


        System.out.println("========================Задание 2========================");
        Running_place run1 = new Running_place(110);
        Wall wall1 = new Wall(8);

        Member member=cat1; //Выбираем участника для бега и прыжка

        if (run1.start(cat1)==true){
            System.out.println(member.getName()+" смог пробежать "+run1.length+" условных единиц");
        }else{
            System.out.println(member.getName()+" не смог пробежать "+run1.length+" условных единиц");
        }
        if(wall1.start(cat1)==true){
            System.out.println(member.getName()+" смог перепрыгнуть "+wall1.height+" условных единиц");
        }else{
            System.out.println(member.getName()+" не смог перепрыгнуть "+wall1.height+" условных единиц");
        }

        System.out.println("========================Задание 3========================");
        Running_place run2 = new Running_place(130);
        Member[] mas = new Member[3];
        mas[0] = man1;
        mas[1] = cat1;
        mas[2] = bot1;

        Polosa[] pol_mas = new Polosa[3];
        pol_mas[0]=run1;
        pol_mas[1]=wall1;
        pol_mas[2]=run2;

        for (int i=0;i < mas.length;i++){
            for (int j=0;j < pol_mas.length;j++){
                if (pol_mas[j].start(mas[i])==false){
                    System.out.println(mas[i].getName()+" не смог преодолеть полосу препятствий");
                    break;
                }
                if(j==2){
                    System.out.println(mas[i].getName()+" успешно преодолевает полосу препятствий");
                }
            }
        }
    }
}