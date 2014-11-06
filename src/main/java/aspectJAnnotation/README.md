In this tutorial, we show you how to integrate AspectJ annotation with Spring AOP framework. In simple, Spring AOP + AspectJ allow you to intercept method easily.
To use aspectJ annotation, you need to add the dependency.

@Before – Run before the method execution
@After – Run after the method returned a result
@AfterReturning – Run after the method returned a result, intercept the returned result as well.
@AfterThrowing – Run after the method throws an exception
@Around – Run around the method execution, combine all three advices above.

1.Create CustomerBo interface
2.Create the CustomerBoImpl to implement CustomerBo
3.Create LoggingAspect to intercept the CustomerBo
4.Create the spring bean configure file aspectJAnnotation.xml
5.Add the annotation for LoggingAspect
6.Create the App class to retrieve the customer bean from aspectJAnnotation.xml file and run related method.


It’s always recommended to apply the least power AsjectJ annotation. It’s rather long article about AspectJ in Spring. for further explanations and examples, please visit the reference links below.