package chapter3.polymorphism01;

public class Penguin extends Animal {
    public String habitat;

    public void showHabitat(){
        System.out.printf("%s live in %s\n",name,habitat);
    }

    // 오버 라이딩
    public void showName(){
        System.out.println("Why you want my name?");
    }

    //오버 로딩
    public void showName(String yourName){
        System.out.printf("Hi, %s, my name is %s\n",yourName,name);
    }
}
