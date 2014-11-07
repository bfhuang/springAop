package aspectJAnnotation;

import org.aspectj.lang.annotation.Pointcut;

public interface CustomerBo {

    void addCustomer();

    String addCustomerReturnValue();

    void addCustomerThrowException() throws Exception;

    void addCustomerAround();
}
