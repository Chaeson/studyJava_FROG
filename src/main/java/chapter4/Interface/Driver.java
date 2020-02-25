package chapter4.Interface;

interface Speakable{
    double PI = 3.14159;
    final double absoluteZeroPoint=-275.15;

    void sayYes();

    //public static final double PI=3.141592;
    //public static final absoluteZeroPoint=-275.15;

    //abstract void sayYes();
}

class Speaker implements Speakable{

    @Override
    public void sayYes() {
        System.out.println("I SAY NO! ");
    }
}
public class Driver {
    public static void main(String[] args){
        System.out.println(Speakable.absoluteZeroPoint);
        System.out.println(Speakable.PI);

        Speaker reporter1=new Speaker();
        reporter1.sayYes();
    }
}
/*
인터페이스는 추상 메서드와 정적 메서드만 가질 수 있다.
따라서 주석의 내용과 동일하다.
그렇다면 의문은 추상 클래스와 인터페이스를 왜 분리해서 쓰는가?
추상 클래스는 추상 메소드 1개이상이 있는 경우에 무조건 추상 클래스로 분류가 된다.
인터페이스의 경우 추상 메소드와 정적변수로만 구성이 된다.
 */