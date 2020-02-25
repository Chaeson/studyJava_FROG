package chapter4.staticBlock;

public class Driver05 {
    public static void main(String[] args){
        System.out.println("main Method Start!");
        System.out.println(Driver05Animal.age);
    }
}

class Driver05Animal{
    static int age=0;
    static {
        System.out.println("Animal Class Ready!!");
    }
}

