Use tips: Check out the project, go to the project directory, run 'gradle idea', then open the springAop.ipr with Intellij.

There are 3 types of Aop implementation, the steps of using each one of them is under in the README.md file under each package.


Use the simplest thing that can work. Spring AOP is simpler than using full AspectJ as there is no requirement to introduce the AspectJ compiler / weaver into your development and build processes. If you only need to advise the execution of operations on Spring beans, then Spring AOP is the right choice. If you need to advise objects not managed by the Spring container (such as domain objects typically), then you will need to use AspectJ. You will also need to use AspectJ if you wish to advise join points other than simple method executions (for example, field get or set join points, and so on).