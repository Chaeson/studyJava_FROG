package chapter3.encapsulation01.packageOne;
import chapter3.encapsulation01.packageOne.ClassA;

public class ClassB {

    void runSomething(){
        System.out.println(ClassA.defSt);
        System.out.println(ClassA.proSt);
        System.out.println(ClassA.pubSt);
    }

    static void runStaticThing(){
        System.out.println(ClassA.pubSt);
        System.out.println(ClassA.proSt);
        System.out.println(ClassA.defSt);
    }
}
/*
1. ClassA와 서로 같은 패키지안에 구성되어 있는 경우.

ClassB 의 경우 같은 패키지 내에 있는 ClassA에 대해 접근이 가능하다.
하지만, ClassA의 객체를 통한 값이나 메소드 호출이 가능하여 Static프레임에 있는 변수나 메서드에 한에서만 가능함.
 */