package chapter7.expert001_03;

public class Driver {
    public static void main(String[] args){
        Tire tire = new KoreaTire();
        Car car = new Car();
        car.setTire(tire);

        System.out.println(car.getTireBrand());
    }
}
/*
속성을 통한 의존성 주입
- Tire 생성자의 속성을 Car에 주입하여 결과 확인.

-> 스프링 X
 */