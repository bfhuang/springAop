package advice;

import org.springframework.aop.ThrowsAdvice;

public class HijackThrowException implements ThrowsAdvice{
    public void afterThrowing(IllegalArgumentException e) {
        System.out.println("HijackThrowException");
    }
}
