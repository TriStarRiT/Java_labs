package ru.java.hibernate;

// /buy Ivan dsa

import org.hibernate.Session;
import org.hibernate.query.Query;
import ru.java.hibernate.entity.Customer;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        //Query<Customer> query = session.createQuery("FROM Customer", Customer.class);


        //List a = session.createQuery("SELECT a FROM Customer a", Customer.class).getResultList();
        Scanner sc = new Scanner(System.in);
        String com = sc.next();
        String text = sc.nextLine();
        System.out.println(com);
        System.out.println(text);

        switch(com){
            case "/showProductsByPerson":
                System.out.println("gfd");
                break;
            case "/findPersonsByProductTitle":
                System.out.println("gfd");
                break;
            case "/removePerson":
                System.out.println("gfd");
                break;
            case "/removeProduct":
                System.out.println("gfd");
                break;
            case "/buy":
                text.trim();
                String[] part =  text.trim().split(" ");
                String w1=text.substring(0, part[0].length()+1).trim();
                String w2=text.substring(part[0].length()+1).trim();
                System.out.println(w1);
                System.out.println(w2);
                String hql = "select id from Customer where name = 'Ivan'";
                Query<Customer> query = session.createQuery(hql, Customer.class);
                List<Customer> userId = query.list();
                for(Customer customer: userId){
                    System.out.println(customer.toString());
                }
                break;

        }

        //Customer customer1 = (Customer) a.get(0);
        //System.out.println(customer1.getName());

        //session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
