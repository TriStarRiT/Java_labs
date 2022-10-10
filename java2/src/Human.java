public class Human extends Members implements Run, Jump {
    String name;
    int run;
    int jump;

    public Human(String name, int run, int jump){
        this.name= name;
        this.run=run;
        this.jump=jump;
    }

    public void run(String name,int dist){
        System.out.println("Человек "+name+" пробежал "+dist+" условных единиц");

    }
    public void jump(String name, int hei){
        System.out.println("Человек "+name+" пригнул на "+hei+" условных единиц");
    }
}
