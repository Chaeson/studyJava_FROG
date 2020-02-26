package chapter6.proxyPattern;

public class ClientWithNoProxy {
    public static void main(String[] args){
        Service service=new Service();
        System.out.println(service.runSomething());
    }
}
/*
메소드를 직접 처리하는 방식은 Proxy패턴을 적용한 사항이 아니다.
 */