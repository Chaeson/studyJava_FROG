package chapter7.aop005;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter7/aop005/aop005.xml");

        Person boy = context.getBean("boy", Person.class);
        Person girl = context.getBean("girl", Person.class);

        boy.runSomething();
        girl.runSomething();
    }
}