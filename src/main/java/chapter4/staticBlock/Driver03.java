package chapter4.staticBlock;

public class Driver03 {
    public static void main(String[] args){
        System.out.println("main method Start!!");
        Animal pororo = new Animal();
    }
}
/*
중요: T메모리 구조에서 클래스는 Static영역에 할당되는 것이 아닌 실제로 클래스가 사용될때 Static영역에 할당됨.
 */