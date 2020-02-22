package chapter3.inheritance03;

public class Penguin extends Animal {
    public String habitat;

    public void showHabitat(){
        System.out.printf("%s is live in %s\n",name,habitat);
    }
}
