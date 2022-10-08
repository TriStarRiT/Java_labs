public class Main {
    public static void main(String[] args) {

        Human Bob = new Human("Боб",100,3);
        Cat Bar = new Cat("Барсик",50,2);
        Bot Rob = new Bot("Роберт",200,1);
        Run_Place RPlace = new Run_Place(78);
        Jump_place JPlace = new Jump_place(2);

        Bob.run();
        Bob.jump();

        Bar.run();
        Bar.jump();

        Rob.run();
        Rob.jump();
    }
}