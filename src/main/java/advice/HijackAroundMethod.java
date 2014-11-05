package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HijackAroundMethod implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("HijackAroundMethod:before");

        try{
            Object result = invocation.proceed();
            System.out.println("HijackAroundMethod:after");
            return result;
        }catch (Exception e) {
            System.out.println("HijackAroundMethod:exception");
            throw e;
        }
    }
}
