package aspectJAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspectJAnnotation.xml");
        CustomerBo customer = (CustomerBo) context.getBean("customerBo");

//        Spring AOP only supports method execution join points for Spring beans
//
//        customer.addCustomerReturnValue();

//        try {
//            customer.addCustomerThrowException();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        customer.addCustomerAround();
    }
}
