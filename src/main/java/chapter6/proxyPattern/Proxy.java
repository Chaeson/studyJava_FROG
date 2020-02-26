package chapter6.proxyPattern;

public class Proxy implements IService {

    IService iService;

    @Override
    public String runSomething() {
        System.out.println("Call Controll, Only return Value Send");

        iService= new ProxyService();
        return iService.runSomething();
    }
}
