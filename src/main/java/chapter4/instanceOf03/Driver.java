package chapter4.instanceOf03;

interface flying{}

class Bat implements flying{}

class Sparrow implements flying{}

public class Driver {
    public static void main(String[] args){
        flying batObj=new Bat();
        flying sparrowObj=new Sparrow();

        System.out.println(batObj instanceof flying);
        System.out.println(batObj instanceof Bat);

        System.out.println(sparrowObj instanceof flying);
        System.out.println(sparrowObj instanceof Sparrow);

    }
}
/*
실제 객체의 타입에 의해 처리된다. instanceOf02 패키지의 예제와 동일한 구성이다.
 */