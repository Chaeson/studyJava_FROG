package chapter6.proxyPattern;

public class ClientWithProxy {
    public static void main(String[] args){
        IService proxy=new Proxy();
        System.out.println(proxy.runSomething());
    }
}
/*
- 프록시 패턴은 제어 흐름을 조정하기 위한 목적으로 중간에 대리자를 두는 패턴
- 리턴(반환) 값 자체에는 변화가 없음
- 개방 폐쇄 원칙(OCP) / 의존 역전 원칙(DIP)
 */