
public class MyClass {
    @Table
    private String table;
    @Column
    private  String[] column;
    public String getTable(){
        return table;
    }
    public String[] getColumn(){return column;
    }
}
