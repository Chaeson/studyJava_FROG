package chapter6.templateMethodPattern;

public class CatTemplate extends Animal {

    // 추상 메서드 오버라이딩
    @Override
    void play() {
        System.out.println("야옹~ 야옹~");
    }

    // Hook메서드 오버라이딩
    @Override
    void runSomething() {
        System.out.println("야옹~ 야옹~ 꼬리 살랑 살랑~");
    }
}
