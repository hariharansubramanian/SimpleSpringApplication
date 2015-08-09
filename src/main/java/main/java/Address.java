package main.java;

public class Address {
    private String street;
    private String postcode;

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    public void init() {                             //Declared as default init-method
        System.out.println("default Init method called");
    } //Declared as default init-method

    public void destroy() {
        System.out.println("default Destroy method called");       //Declared as default destroy-method
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }

    public void setPostcode(String postcode) {
    }

    public void setStreet(String street) {
    }
}
