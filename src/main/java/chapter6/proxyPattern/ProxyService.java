package chapter6.proxyPattern;

public class ProxyService implements IService {

    @Override
    public String runSomething() {
        return "IService: ProxyService - runSomething Method";
    }
}
