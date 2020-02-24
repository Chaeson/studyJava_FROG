package chapter3.encapsulation01.packageOne;

public class ClassA {
    private int pri;
    int def;
    protected int pro;
    public int pub;

    static private int priSt;
    static int defSt;
    static protected int proSt;
    static public int pubSt;

    void runSomething(){
        System.out.println(pri);
        System.out.println(def);
        System.out.println(pro);
        System.out.println(pub);

        System.out.println(priSt);
        System.out.println(defSt);
        System.out.println(proSt);
        System.out.println(pubSt);
    }

    static void runStaticThing(){
        //System.out.println(pri);
        //System.out.println(def);
        //System.out.println(pro);
        //System.out.println(pub);

        System.out.println(priSt);
        System.out.println(defSt);
        System.out.println(proSt);
        System.out.println(pubSt);
    }
}

/*
public -> 모두 접근이 가능.
protected -> 상속 및 같은 패키지 내의 클래스에서 접근이 가능.
default -> 같은 패키지 내의 클래스에서 접근이 가능.
private -> 해당 클래스에서만 접근이 가능

runSomething 메소드와 runStaticThing 메소드의 경우 생성 및 실행되는 영역이 Static프레임과 Stack프레임으로 나뉘어 진다.
변수들 모두 Stack프레임에 생성되고 해당영역은 Static프레임에는 할당이 되지 못한다.
 */