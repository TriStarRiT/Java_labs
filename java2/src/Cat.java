public class Cat implements Run, Jump {
    public String name;
    public int run;
    public int jump;

    public Cat(String name, int run, int jump){
        this.name= name;
        this.run=run;
        this.jump=jump;
    }

    public void run(){
        System.out.println("Кот "+name+" пробежал "+run+" условных единиц");
    }
    public void jump(){
        System.out.println("Кот "+name+" пригнул на "+jump+" условных единиц");
    }
}
