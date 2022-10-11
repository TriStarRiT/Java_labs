public class Main {
    public static void main(String[] args) {

        System.out.println("========================Задание 1========================");

        Human Bob = new Human("Боб",100,3);
        Cat Bar = new Cat("Барсик",50,2);
        Bot Rob = new Bot("Роберт",200,1);

        Bob.run(Bob.name,Bob.run);
        Bob.jump(Bob.name, Bob.jump);

        Bar.run(Bar.name, Bar.run);
        Bar.jump(Bar.name, Bar.jump);

        Rob.run(Rob.name, Rob.run);
        Rob.jump(Rob.name, Rob.jump);

        System.out.println("========================Задание 2========================");

        Run_Place RPlace = new Run_Place(78);
        Jump_place JPlace = new Jump_place(2);

        RPlace.run(Bob.name, Bob.run);
        JPlace.jump(Bob.name, Bob.jump);

        RPlace.run(Bar.name, Bar.run);
        JPlace.jump(Bar.name, Bar.jump);

        RPlace.run(Rob.name, Rob.run);
        JPlace.jump(Rob.name, Rob.jump);

        System.out.println("========================Задание 3========================");


        int[] polosa = new int[3];
        polosa[0]=RPlace.length;
        polosa[1]=JPlace.height;
        polosa[2]=RPlace.length;

            for (int j=0;j< polosa.length;j++){
                if (polosa[j]==RPlace.length) {

                    if (Bob.runpr(RPlace.length) == true) {
                        System.out.println(Bob.name + " не смог преодолеть полосу препятствий");
                        break;
                    }
                }
                if (polosa[j]==JPlace.height){
                    if(Bob.jumppr(JPlace.height)==true){
                        System.out.println(Bob.name+" не смог преодолеть полосу препятствий");
                        break;
                    }
                }
                if(j== polosa.length-1) {
                    System.out.println(Bob.name + " успешно преодолевает полосу препятствий");
                }
            }

        for (int j=0;j< polosa.length;j++){
            if (polosa[j]==RPlace.length) {

                if (Bar.runpr(RPlace.length) == true) {
                    System.out.println(Bar.name + " не смог преодолеть полосу препятствий");
                    break;
                }
            }
            if (polosa[j]==JPlace.height){
                if(Bar.jumppr(JPlace.height)==true){
                    System.out.println(Bar.name+" не смог преодолеть полосу препятствий");
                    break;
                }
            }
            if(j== polosa.length-1) {
                System.out.println(Bar.name + " успешно преодолевает полосу препятствий");
            }
        }

        for (int j=0;j< polosa.length;j++){
            if (polosa[j]==RPlace.length) {

                if (Rob.runpr(RPlace.length) == true) {
                    System.out.println(Rob.name + " не смог преодолеть полосу препятствий");
                    break;
                }
            }
            if (polosa[j]==JPlace.height){
                if(Rob.jumppr(JPlace.height)==true){
                    System.out.println(Rob.name+" не смог преодолеть полосу препятствий");
                    break;
                }
            }
            if(j== polosa.length-1) {
                System.out.println(Rob.name + " успешно преодолевает полосу препятствий");
            }
        }
    }
}