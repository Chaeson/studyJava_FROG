package chapter4.Super;

class Animal{
    void method(){
        System.out.println("Animal");
    }
}

class Bird extends Animal{
    void method(){
        super.method();
        System.out.println("Bird");
    }
}

class Penguin extends Bird{
    void method(){
        super.method();
        System.out.println("Penguin");
    }
}
public class Driver {
    public static void main (String[] args){
        Penguin pororo=new Penguin();
        pororo.method();
    }
}

/*
super 실행 이후 자기 자신의 하위 목록 실행.
super 키워드 사용시 우선순위를 먼저 가짐.
 */