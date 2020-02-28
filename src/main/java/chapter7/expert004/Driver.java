package chapter7.expert004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("chapter7/expert004/expert004.xml");

        Car car = context.getBean("car", Car.class);

        System.out.println(car.getTireBrand());
    }
}
/*

 */