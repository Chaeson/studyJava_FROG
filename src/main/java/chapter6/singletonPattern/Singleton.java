package chapter6.singletonPattern;

public class Singleton {
    static Singleton singletonObj;  // 정적 참조 변수

    private Singleton() {};         // private 생성자

    // 객체 반환 정적 메소드
    public static Singleton getInstance(){
        if(singletonObj == null){
            singletonObj = new Singleton();
        }

        return singletonObj;
    }
}
