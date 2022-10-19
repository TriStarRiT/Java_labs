import java.util.ArrayList;
public class Box<T> {
    ArrayList<T> box = new ArrayList<>();
    double fruitWeight;

    public Box(ArrayList box,double fruitWeight){
        this.box=box;
        this.fruitWeight=fruitWeight;
    }
    public double getWeight(){
        return box.size()*fruitWeight;
    }
    public void Compare(Box cringe){
        System.out.println(getWeight()==cringe.getWeight());
    }

    public void change(Box cringe){
        this.box.addAll(cringe.box);
        for(int i=0;i<box.size();i++){
            System.out.println(box.get(i));
        }
        cringe.box.clear();
    }

}
