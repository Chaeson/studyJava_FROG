package chapter3.encapsulation01.packageTwo;
import chapter3.encapsulation01.packageOne.ClassA;

public class ClassAB extends ClassA {
    void runSomething(){
        System.out.println(pro);
        System.out.println(pub);

        System.out.println(proSt);
        System.out.println(pubSt);

        System.out.println(ClassA.pubSt);
        System.out.println(ClassA.proSt);
    }

    static void runStaticThing(){
        System.out.println(proSt);
        System.out.println(pubSt);

        System.out.println(ClassA.pubSt);
        System.out.println(ClassA.proSt);
    }
}
/*
3. 다른 패키지에 있는 경우, ClassA패키지를 상속받은 경우.
- protected,public 변수는 사용이 가능하다.
 */
