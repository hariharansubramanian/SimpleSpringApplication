package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("spring-config.xml"); //Creates Spring Bean container to get beans

        Person person1 = (Person) context.getBean("person"); //factory-method gets called using constructor-args, then init-method gets called.
        Person person2 = (Person) context.getBean("person");//factory-method gets called using constructor--args, then init-method gets called.

        person1.setTaxId(666);

        Address address = (Address) context.getBean("address");
        System.out.println(address);

        System.out.println(person1);
        System.out.println(person2);
    }
}
