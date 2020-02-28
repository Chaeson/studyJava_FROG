package chapter7.expert001_01;

public class Driver {
    public static void main(String[] args){
        Car car = new Car();

        System.out.println(car.getTireBrand());
    }
}
/*
두 객체(Car - Tire)사이에서 직접 의존성을 해결하는 코드.
Car애서 Tire를 생성하는 방식을 통해 직접 의존성을 해결함.
전체(큰 클래스)가 부분 객체(작은 클래스)에 의존하는 방식 -> Car가 Tire에 의존.
 */