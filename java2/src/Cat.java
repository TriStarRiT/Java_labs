public class Cat extends Members implements Run, Jump {
    public String name;
    public int run;
    public int jump;

    public Cat(String name, int run, int jump){
        this.name= name;
        this.run=run;
        this.jump=jump;
    }

    public void run(String name, int dist){

        System.out.println("Кот "+name+" пробежал "+dist+" условных единиц");
    }
    public void jump(String name, int hei){

        System.out.println("Кот "+name+" пригнул на "+hei+" условных единиц");
    }
}
