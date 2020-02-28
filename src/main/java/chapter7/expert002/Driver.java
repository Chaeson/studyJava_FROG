package chapter7.expert002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("chapter7/expert002/expert002.xml");

        Car car = context.getBean("car",Car.class);

        Tire tire = context.getBean("tire",Tire.class);

        car.setTire(tire);

        System.out.println(car.getTireBrand());
    }
}
/*
스프링을 통한 의존성 주입
xml 파일을 읽어와서 객체를 얻는다.(getBean)
xml 변경만으로 수정이 가능하다.
 */