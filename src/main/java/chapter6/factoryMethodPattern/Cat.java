package chapter6.factoryMethodPattern;

public class Cat extends Animal {
    //추상 팩터러 메서드 오버라아딩
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
