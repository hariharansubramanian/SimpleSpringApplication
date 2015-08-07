package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Nicky on 8/6/2015.
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("spring-config.xml"); //Creates Spring Bean container to get beans

        Person person = (Person) context.getBean("person");
        person.speak();

        Address address= (Address) context.getBean("address");
        System.out.println(address);

        System.out.println(person);// S.O.P applies toString() to every member variable of person object

    }
}
