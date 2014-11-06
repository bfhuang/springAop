package aspectJAnnotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LoggingAspect {

    @Before("execution(* aspectJAnnotation.CustomerBo.addCustomer(..))")
    public void logBefore(JoinPoint joinpoint){
        System.out.println("logBefore() is running");
    }

    @After("execution(* aspectJAnnotation.CustomerBo.addCustomer(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logAfter() is running");
    }

    @AfterReturning(
            pointcut = "execution(* aspectJAnnotation.CustomerBo.addCustomerReturnValue(..))",
            returning= "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("logAfterReturning() is running!");
        System.out.println("Method returned value is : " + result);
    }

//    can also used in the way as afterReturning
    @AfterThrowing("execution(* aspectJAnnotation.CustomerBo.addCustomerThrowException(..))")
    public void logAfterThrowing(JoinPoint joinPoint) {
        System.out.println("logAfterThrowing() is running");
    }

    @Around("execution(* aspectJAnnotation.CustomerBo.addCustomerAround(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("logAround() is running!");

        System.out.println("Around before is running!");
        joinPoint.proceed(); //continue on the intercepted method
        System.out.println("Around after is running!");
    }
}
