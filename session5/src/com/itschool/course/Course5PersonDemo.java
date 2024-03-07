package com.itschool.course;

public class Course5PersonDemo {
    public static void main(String[] args) {
        Person andreea = new Person();
        Person ionutz = new Person();
        Person maria = new Person();

        System.out.println(andreea.getLastName());

        System.out.println(andreea.getAge());
        System.out.println(andreea.getCnp());

        andreea.setFirstName("Andreea");
        andreea.setAge(21);
        andreea.setCnp(12434546567865754435L);

        System.out.println("Results after setting properties");
        System.out.println(andreea);




    }
}
