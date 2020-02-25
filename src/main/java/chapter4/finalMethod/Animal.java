package chapter4.finalMethod;

public class Animal {
    final void breathe(){
        System.out.println("Breathing...");
    }
}

class Mammals extends Animal{
    //void breathe(){ System.out.println("Breathing...."); }
}

/*
Animal 클래스의 breath메소드는 final이므로 속성을 재정의 하는 것처럼 메소드 또한 재정의, 즉, 오버라이딩 되지 않는다.
 */