package org.example.model;

//import javax.persistence.Entity;

public class Customer {
    private Long id;
    private String name;

    /*public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

     */
    public void setId(Long id){
        this.id =id;
    }
    public Long getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
