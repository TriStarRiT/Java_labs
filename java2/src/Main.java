public class Main {
    public static void main(String[] args) {

        System.out.println("========================Задание 1========================");

        Human Bob = new Human("Боб",100,3);
        Cat Bar = new Cat("Барсик",50,2);
        Bot Rob = new Bot("Роберт",200,1);
        Run_Place RPlace = new Run_Place(78);
        Jump_place JPlace = new Jump_place(2);

        Bob.run(Bob.name,Bob.run);
        Bob.jump(Bob.name, Bob.jump);

        Bar.run(Bar.name, Bar.run);
        Bar.jump(Bar.name, Bar.jump);

        Rob.run(Rob.name, Rob.run);
        Rob.jump(Rob.name, Rob.jump);

        System.out.println("========================Задание 2========================");

        RPlace.run(Bob.name, Bob.run);
        JPlace.jump(Bob.name, Bob.jump);

        RPlace.run(Bar.name, Bar.run);
        JPlace.jump(Bar.name, Bar.jump);

        RPlace.run(Rob.name, Rob.run);
        JPlace.jump(Rob.name, Rob.jump);

        System.out.println("========================Задание 3========================");

        Members[] members = new Members[3];
        members[0]=Bob;
        members[1]=Bar;
        members[2]=Rob;
        Polosa[] polosa = new Polosa[3];
        polosa[0]=RPlace;
        polosa[1]=JPlace;
        polosa[2]=RPlace;

        Polosa.PolosaPr(members, polosa);

        for (int i=0;i< members.length;i++){
            for (int j=0;j< polosa.length;j++){
                if (polosa[j]==RPlace){
                    boolean b=Members.run(members[i].name, members[i].run);
                }
            }
        }
    }
}