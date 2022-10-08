public class Human implements Run, Jump {
    String name;
    int run;
    int jump;

    public Human(String name, int run, int jump){
        this.name= name;
        this.run=run;
        this.jump=jump;
    }

    public void run(){
        System.out.println("Человек "+name+" пробежал "+run+" условных единиц");

    }
    public void jump(){
        System.out.println("Человек "+name+" пригнул на "+jump+" условных единиц");
    }
}
