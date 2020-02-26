package chapter6.templateMethodPattern;

public class DogTemplate extends Animal {

    //추상 메서드 오버라이딩
    @Override
    void play() {
        System.out.println("멍! 멍!");
    }

    //Hook 메서드 오버라이딩
    @Override
    void runSomething(){
        System.out.println("멍! 멍! 꼬리 살랑 살랑~");
    }
}
