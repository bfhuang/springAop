package aspectJInXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspectJInXml.xml");
        CustomerBo customer = (CustomerBo) context.getBean("customerBo");

//        customer.addCustomer();

//        customer.addCustomerReturnValue();
//
//        try {
//            customer.addCustomerThrowException();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        customer.addCustomerAround();
    }
}
