package chapter6.decoratorPattern;

public class ClientWithDecorator {
    public static void main(String[] args){
        IService decorator=new Decorator();
        System.out.println(decorator.runSomething());
    }
}
/*
- 기본 개념자체는 프록시 패턴과 동일하다.
- 데코레이터 패턴과의 차이점은 반환값에 있다.
- 반환값 자체 변경이 없는 경우는 프록시 / 반환값에 변화(return 값의 형식에 변화)가 있는 경우는 데코레이터
- OCP / DIP 적용
 */