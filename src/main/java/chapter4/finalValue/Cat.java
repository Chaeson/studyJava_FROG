package chapter4.finalValue;

public class Cat {
    final static int staticInt01=1;
    final static int staticInt02;

    final int objectInt01=1;
    final int objectInt02;

    static {
        staticInt02=2;

        //staticInt02는 변경시도
        //staticInt02=4;  -> 한번 선언된 정적변수는 변경이 불가능하다.
        //objectInt02는 스태틱 변수(속성)이 아니어서 static블럭에서 사용 및 초기화가 불가능하다. (staticBlock패키지 내용 참조)
    }

    Cat(){
        objectInt02=4;

        // objectInt02=5; -> final 속성, 변수는 한번 초기화 후 변경이 불가능하다.

        final int localValue01=1;
        final int localValue02;

        localValue02=2;
    }
}
