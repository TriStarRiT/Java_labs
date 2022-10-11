public class Run_Place implements Run{
    int length;

    public Run_Place(int length){

        this.length=length;
    }

    public void run(String name,int dist){
        if (dist>=length){
            System.out.println(name+" смог пробежать дистанцию длинной в "+ dist);
        }
        else{
            System.out.println(name+" не смог пробежать дистанцию длинной в "+ dist);
        }
    }

    public boolean runpr(int len) {
        return false;
    }
}
