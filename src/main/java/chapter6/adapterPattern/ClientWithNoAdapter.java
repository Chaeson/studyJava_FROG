package chapter6.adapterPattern;

public class ClientWithNoAdapter {
    public static void main(String[] args){
        ServiceA sa=new ServiceA();
        ServiceB sb=new ServiceB();

        sa.runServiceA();
        sb.runServiceB();
        /*
        구동 순서(어댑터 디자인 패턴 미적용)
        L5: ServiceA 객체 생성
        L6: ServiceB 객체 생성
        L8: runServiceA 호출(실행)
        L9: runServiceB 호출(실행)

        -> 호출(실행)하는 메소드가 비슷한 역할을 하지만 메소의 명이 서로 다름
         */
        AdapterServiceA asa=new AdapterServiceA();
        AdapterServiceB asb=new AdapterServiceB();

        asa.runService();
        asb.runService();

        /*
        구동 순서(어댑터 디자인 패턴 적용)
        L19: ServiceA 변환기 생성(AdapterServiceA 객체 생성) -> ServiceA 객체 생성
        L20: ServiceB 변환기 생성(AdapterServiceB 객체 생성) -> ServiceB 객체 생성
        L22: AdapterServiceA.runService 호출 -> ServiceA의 runServiceA 호출
        L23: AdapterServiceB.runService 호출 -> ServiceB의 runServiceB 호출

        -> 호출 당하는 쪽의 메서드(runServiceA,B)를 호출하는 쪽(runService)에 대응하도록 중간에 변환기를 통해 호출
         */
    }
}
