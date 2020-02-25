package chapter4.instanceOf01;

class Animal{

}

class Bird extends Animal{

}

class Penguin extends Bird{

}

public class Driver {
    public static void main(String[] args){
        Animal animalObj=new Animal();
        Bird birdObj=new Bird();
        Penguin penguinObj=new Penguin();

        System.out.println(animalObj instanceof Animal);

        System.out.println(birdObj instanceof Animal);
        System.out.println(birdObj instanceof Bird);

        System.out.println(penguinObj instanceof Animal);
        System.out.println(penguinObj instanceof Bird);
        System.out.println(penguinObj instanceof Penguin);

        System.out.println(penguinObj instanceof Object);
    }
}
