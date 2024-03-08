package com.itschool.course;

public class Course5PersonConstructor {
    public static void main(String) args) {
       Person Andreea = new Person( "Marginas",  12434546567865754435L);
       System.out.println(Andreea.getLastName());
       System.out.println(Andreea.getCnp());

       String lastName = Andreea.getLastName();
       long cnp = Andreea.getCnp();

       System.out.println(lastName);
       System.out.println(cnp);

       System.out.println();

    }
}
