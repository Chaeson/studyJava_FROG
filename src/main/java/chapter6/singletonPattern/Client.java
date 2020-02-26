package chapter6.singletonPattern;

public class Client {
    public static void main(String[] args){
        // private 생성자는 new 를 통해 인스턴스 생성이 불가능
        // Singleton s = new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1=null;
        s2=null;
        s3=null;
    }
}
/*
- 출력 결과는 모두 동일한 값을 사용하게 된다.
- 이는 모두 동일한 주소값, 즉 동일한 값을 참조하게 된다.
- 인스턴스를 하나만 만들어 사용하기 위한 패턴.(공유 객체)
- 쓰기 속성을 갖지 않는 것이 정석.
 */