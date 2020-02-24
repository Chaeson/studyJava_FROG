package chapter3.encapsulation01.packageOne;

public class ClassAA extends ClassA {
    void runSomething(){
//        System.out.println(pri);
        System.out.println(def);
        System.out.println(pro);
        System.out.println(pub);

//        System.out.println(priSt);
        System.out.println(defSt);
        System.out.println(proSt);
        System.out.println(pubSt);

        System.out.println(ClassA.pubSt);
        System.out.println(ClassA.proSt);
        System.out.println(ClassA.defSt);

    }

    static void runStaticThing(){
//        System.out.println(pri);
//        System.out.println(def);
//        System.out.println(pro);
//        System.out.println(pub);

//        System.out.println(priSt);
        System.out.println(defSt);
        System.out.println(proSt);
        System.out.println(pubSt);

        System.out.println(ClassA.pubSt);
        System.out.println(ClassA.proSt);
        System.out.println(ClassA.defSt);
    }
}
/*
2. 같은 패키지 내, ClassA클래스를 상속받은 경우.
ClassAA는 ClassA를 상속받아 pri 제외한 모든 변수 사용이 가능하다.
Private의 경우 자기 자신의 클래스에서만 사용이 가능하기 떄문.
 */
