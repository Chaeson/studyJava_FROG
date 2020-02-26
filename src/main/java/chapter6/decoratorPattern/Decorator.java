package chapter6.decoratorPattern;

public class Decorator implements IService {
    IService service;

    public String runSomething(){
        System.out.println("호출 내부 장식 주목적, 반환값에 장식을 더함...");

        service=new Service();
        return "real "+service.runSomething();
    }
}
