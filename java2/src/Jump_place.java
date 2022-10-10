public class Jump_place extends Polosa implements Jump {
    int height;

    public Jump_place(int height){

        this.height=height;
    }
    public void jump(String name, int hei){
        if (hei>=height){
            System.out.println(name+" смог перепрыгнуть препятствие высотой "+ hei);
        }
        else{
            System.out.println(name+" не смог перепрыгнуть препятствие высотой "+ hei);
        }
    }
}
