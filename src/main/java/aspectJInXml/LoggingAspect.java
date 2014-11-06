package aspectJInXml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

    public void logBefore(JoinPoint joinpoint){
        System.out.println("logBefore() is running");
    }

    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logAfter() is running");
    }

    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("logAfterReturning() is running!");
        System.out.println("Method returned value is : " + result);
    }

    public void logAfterThrowing(JoinPoint joinPoint) {
        System.out.println("logAfterThrowing() is running");
    }

    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("logAround() is running!");

        System.out.println("Around before is running!");
        joinPoint.proceed(); //continue on the intercepted method
        System.out.println("Around after is running!");
    }
}
