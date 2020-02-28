package chapter7.aop001;

public class Start {
    public static void main(String[] args){
        Boy boy = new Boy();
        Girl girl = new Girl();

        boy.runSomething();
        System.out.println();
        girl.runSomething();
    }
}
