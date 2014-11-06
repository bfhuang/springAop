package advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("advice.xml");

        Person person = (Person) context.getBean("personProxy");

        System.out.println("***************");
        person.printName();
        System.out.println("***************");
        person.printAge();
        System.out.println("***************");
        try {

        person.throwException();
        }catch (Exception e){

        }

    }
}
