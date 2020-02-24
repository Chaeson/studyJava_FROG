package chapter3.encapsulation01.packageTwo;

import chapter3.encapsulation01.packageOne.ClassA;

public class ClassC {
    void runSomething(){
//        System.out.println(pri);
//        System.out.println(def);
//        System.out.println(pro);
//        System.out.println(pub);

//        System.out.println(priSt);
//        System.out.println(defSt);
//        System.out.println(proSt);
//        System.out.println(pubSt);

        System.out.println(ClassA.pubSt);
    }

    static void runStaticThing(){
//        System.out.println(pri);
//        System.out.println(def);
//        System.out.println(pro);
//        System.out.println(pub);

//        System.out.println(priSt);
//        System.out.println(defSt);
//        System.out.println(proSt);
//        System.out.println(pubSt);

        System.out.println(ClassA.pubSt);
    }
}
/*
4. 서로 다른 패키지, 상속한 클래스가 아닌 경우.
 */
