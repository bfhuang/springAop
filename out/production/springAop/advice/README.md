For this part, you need the spring-context and cglib dependency.


Steps:
1.Spring AOP Example – Advice
    Before advice - Run before the method execution.
    After returning advice - Run after the method return a result
    After throwing advice - Run after the method throws an exception
    Around advice - Run around the method execution, combine all the three advices above.

    1.1 Create a simple Person class with few print methods for demonstration later.
    1.2 Add the bean configuration file:springApplicationContext.xml and inject the person object in this file.
    1.3 Create the main class in App class to run the person's print methods.
            public class App {
                public static void main(String[] args) {
                    ApplicationContext context = new ClassPathXmlApplicationContext("springApplicationContext.xml");

                    Person person = (Person) context.getBean("person");

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
    1.4 Run the main class, the result is like below:
            ***************
            Person name: Binfang
            ***************
            Person age: 24
            ***************
    1.5 Create the HijackBeforeMethod class, it will execute before the method execution.
    1.6 Add the bean 'hijackBeforeMethod' for HijackBeforeMethod class and new proxy bean 'personProxy' in the springApplicationContext.xml
    1.7 Change the main class
            public class App {
                public static void main(String[] args) {
                    ApplicationContext context = new ClassPathXmlApplicationContext("springApplicationContext.xml");

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
    1.8 Run the main class, the result is like:
        ***************
        HijackBeforeMethod
        Person name: Binfang
        ***************
        HijackBeforeMethod
        Person age: 24
        ***************
        HijackBeforeMethod
    1.9 In the same way, we can create class for returning advice 'HijackAfterMethod', throwing advice 'HijackThrowException' and around advice 'HijackAroundMethod'.
        The final result is like:
        ***************
        HijackBeforeMethod
        HijackAroundMethod:before
        Person name: Binfang
        HijackAroundMethod:after
        HijackAfterMethod
        ***************
        HijackBeforeMethod
        HijackAroundMethod:before
        Person age: 24
        HijackAroundMethod:after
        HijackAfterMethod
        ***************
        HijackBeforeMethod
        HijackAroundMethod:before
        HijackThrowException
        HijackAroundMethod:exception

    1.10 Advice - Indicate the action to take either before or after the method execution.
         PointCut - Indicate which method should be intercept, by method name or regular expression pattern
         Advisor - Group 'Advice' and 'PointCut' into a single unit, and pass it to a proxy factory object.