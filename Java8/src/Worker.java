
public class Worker /*implements Comparable<Worker>*/{
    private String name;
    private int age;
    private int salary;
    public Worker(String name, int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
/*
    @Override
    public int compareTo(Worker o) {
        return salary.compareTo(o.getSalary());
    }*/
}
