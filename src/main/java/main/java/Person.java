package main.java;

/**
 * Created by Nicky on 8/6/2015.
 */
public class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return ("ID= "+Integer.toString(this.id) + " Name= " +this.name);
    }

    public static void speak() {
        System.out.println("Hello im a person");
    }
}
