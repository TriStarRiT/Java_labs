import java.util.List;
import java.util.ArrayList;
public class Data {
    static List<Worker> data(){
        List<Worker> array = new ArrayList<>();

        Worker worker1= new Worker("Bob1",32,35000);
        Worker worker2= new Worker("Bob2",24,33000);
        Worker worker3= new Worker("Bob3",31,31000);
        Worker worker4= new Worker("Bob4",35,29000);
        Worker worker5= new Worker("Bob5",22,20000);
        Worker worker6= new Worker("Bob6",42,54000);
        Worker worker7= new Worker("Bob7",49,32000);
        Worker worker8= new Worker("Bob8",28,31000);
        Worker worker9= new Worker("Bob9",36,32000);
        Worker worker10= new Worker("Bob10",39,22000);


        array.add(worker1);
        array.add(worker2);
        array.add(worker3);
        array.add(worker4);
        array.add(worker5);
        array.add(worker6);
        array.add(worker7);
        array.add(worker8);
        array.add(worker9);
        array.add(worker10);

        return array;
    }
}
