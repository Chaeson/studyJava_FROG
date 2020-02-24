package chapter3.reference;

public class CallByReference2 {
    public static void main(String[] args){
        Animal ref_a=new Animal();
        Animal ref_b=ref_a;

        System.out.println(ref_a);
        System.out.println(ref_b);
    }
}
/*
Call By Reference는 서로 같은 값을 가지는데, 이는 서로 같은 주소값을 가지고 있다고 볼 수 있다.
=> 같은 객체를 참조하고 있다.
 */