package chapter4.staticBlock;

public class Animal {
    static{
        System.out.println("Animal Class Ready...");
    }
}
/*
해당 sout은 Animal클래스가 Static영역에 배치되기 전 실행된다!
 */
