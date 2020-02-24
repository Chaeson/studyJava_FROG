package chapter3.reference;

public class CallByValue {
    public static void main(String[] args){
        int a = 10;
        int b = a;

        b=20;

        System.out.println(a);
        System.out.println(b);
    }
}

/*
- Call By Value
변수 a와 b에 대한 관계로 b는 단순히 a의 변수값을 초기화 하여 사용, a와 b에 대해 서로 영향 범위가 있지 않다.
이러한 경우가 '값에 의한 호출' 이라고 한다.
 */