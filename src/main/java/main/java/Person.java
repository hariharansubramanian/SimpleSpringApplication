package main.java;

public class Person {

    private int id;
    private String name;
    private int taxId;
    private Address address;

    public Person(int id, String name) {            //Constructor Method
        this.id = id;
        this.name = name;
    }

    public static Person getInstance(int id, String name) {    //FACTORY method
        System.out.println("Factory method called");
        return new Person(id, name);
    }

    public void onCreate() {                        //declared as init-method in bean config xml
        System.out.println("init-method onCreate() called returning object " + this);

    }

    public void onDestroy() {                        //declared as destroy-method in bean config xml
        System.out.println("Person is Destroyed");
    }

    public void setTaxId(int taxId) {               //declared in <property> in bean xml
        this.taxId = taxId;
    }

    public static void speak() {
        System.out.println("Hello im a person");
    }

    public void setAddress(Address address) {       //Setter Method
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", taxId=" + taxId + ", address=" + address + '}';
    }
}
