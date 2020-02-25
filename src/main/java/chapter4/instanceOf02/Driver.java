package chapter4.instanceOf02;

class Animal{}

class Bird extends Animal{}

class Penguin extends Bird{}

public class Driver {
    public static void main(String[] args){
        Animal animalObj=new Animal();
        Animal birdObj=new Bird();
        Animal penguinObj=new Penguin();

        System.out.println(animalObj instanceof Animal);

        System.out.println(birdObj instanceof Animal);
        System.out.println(birdObj instanceof Bird);

        System.out.println(penguinObj instanceof Animal);
        System.out.println(penguinObj instanceof Bird);
        System.out.println(penguinObj instanceof Penguin);

        System.out.println(penguinObj instanceof Object);
    }
}
/*
실제 객체의 타입에 의해 처리된다.
실제 객체는 인스턴스 타입 기준으로 처리된다.
 */