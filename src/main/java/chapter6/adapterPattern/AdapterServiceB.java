package chapter6.adapterPattern;

public class AdapterServiceB {
    ServiceB sb = new ServiceB();

    void runService(){
        sb.runServiceB();
    }
}
