public class Bot implements Run, Jump {
    String name;
    int run;
    int jump;

    public Bot(String name, int run,int jump){
        this.name=name;
        this.run=run;
        this.jump=jump;
    }
    public void run(){
        System.out.println("Робот "+name+" пробежал "+run+" условных единиц");
    }
    public void jump(){
        System.out.println("Робот "+name+" пригнул на "+jump+" условных единиц");
    }
}
