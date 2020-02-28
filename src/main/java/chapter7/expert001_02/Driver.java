package chapter7.expert001_02;

public class Driver {
    public static void main(String[] args){

        Tire tire = new KoreaTire();
        //Tire tire = new AmericaTire();

        Car car = new Car(tire);

        System.out.println(car.getTireBrand());

    }
}
/*
생성자를 통한 의존성 주입.
 - Tire 객체 생성
 - Car 객체 생성(Tire 생성자 주입)

장점: 확장성 용이/코드 컴파일과 재배포에 부담 저하.

-> 스프링 X
 * */