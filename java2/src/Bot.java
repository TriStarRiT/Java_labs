public class Bot implements Run, Jump, PolosaPr {
    String name;
    int run;
    int jump;

    public Bot(String name, int run,int jump){
        this.name=name;
        this.run=run;
        this.jump=jump;
    }
    public void run(String name, int dist){

        System.out.println("Робот "+name+" пробежал "+dist+" условных единиц");
    }
    public void jump(String name, int hei){

        System.out.println("Робот "+name+" пригнул на "+hei+" условных единиц");
    }
    public void Polosa(){
        //System.out.println(name+" не смог преодолеть полосу препятствий");
        //System.out.println(name+" успешно преодолевает полосу препятствий");
    }
    public boolean runpr( int len){
        return len>run;
    }
    public boolean jumppr(int hei){
        return hei>jump;
    }
}
