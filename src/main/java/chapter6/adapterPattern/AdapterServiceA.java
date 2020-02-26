package chapter6.adapterPattern;

public class AdapterServiceA {
    ServiceA sa=new ServiceA();

    void runService(){
        sa.runServiceA();
    }
}
