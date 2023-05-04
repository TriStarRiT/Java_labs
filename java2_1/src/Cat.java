public class Cat implements Member {
    String name;
    int run;
    int jump;
    public Cat(String name, int run, int jump){
        this.name=name;
        this.run=run;
        this.jump=jump;
    }

    @Override
    public void run() {
        System.out.println("Кот пробежал "+run+" условных единиц");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгнул на "+jump+" условных единиц");
    }
    public boolean runpr( int len){
        return len>run;
    }
    public boolean jumppr(int hei){
        return hei>jump;
    }
    @Override
    public String getName() {
        return name;
    }
}
