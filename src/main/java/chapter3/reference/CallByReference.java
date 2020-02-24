package chapter3.reference;

public class CallByReference {
    public static void main(String[] args){
        Animal ref_a = new Animal();
        Animal ref_b = ref_a;

        ref_a.age=10;
        ref_b.age=20;

        System.out.println(ref_a.age);
        System.out.println(ref_b.age);
    }
}

class Animal{
    public int age;
}

/*
- Call By reference(참조에 의한 호출)
1. ref_a의 경우 Animal클래스를 참조하고 하여 호출을 했다.
2. ref_b의 경우 Animal클래스의 객체를 선언했지만 그 참조하는 대상은 ref_a가 바라보고 있는 같은 Heap영역의 주소를 참조한다.
따라서 ref_a와 ref_b가 서로 값은 복사하여 사용하고 있지만 바라보고 있는 Heap영역은 동일한 영역이다.
 */

/*
Call By Reference vs Call By Value
- 서로 변수의 값을 복사한다는 개념은 동일하다.
- 복사하는 값의 대상만 다르다.
- Call By Value: 복사한 값값 자체를 해석
- Call By Reference: 복사한 값을 주소값으로 해석
 */