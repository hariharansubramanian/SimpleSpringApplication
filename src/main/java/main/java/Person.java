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

    public void setTaxId(int taxId) {               //Setter Method
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
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +        //prints address object using address.toString()
                '}';
    }
}
