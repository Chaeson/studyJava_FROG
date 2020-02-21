package chapter3.abstraction02;

public class MouseDriver {
    public static void main(String[] args){
        //클래스명.countOfTail
        Mouse.countOfTail=1;

        Mouse mickey = new Mouse();
        Mouse jerry = new Mouse();
        Mouse mightyMouse = new Mouse();

        System.out.println(mickey.countOfTail);
        System.out.println(jerry.countOfTail);
        System.out.println(mightyMouse.countOfTail);

        System.out.println(Mouse.countOfTail);
    }
}
/*
 -> 클래스 멤버 변수 = 클래스 멤버의 속성
 -> 객체 멤버 변수 = 객체 멤버의 속성
   ==> 두개의 차이는 static의 유무 차이 & 초기화 유무(Static 초기화됨 / Stack 초기화 안됨)

 */
