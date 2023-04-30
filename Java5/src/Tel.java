public class Tel {
    protected String name;
    public int tel;

    public Tel(String name, Integer tel){
        this.name=name;
        this.tel=tel;
    }
    public int getTel1(){
        return tel;
    }
    public String getName1(){
        return name;
    }
    public void getTel(){
        System.out.println(tel);
    }
    public void getName(){
        System.out.println(name);
    }
}
