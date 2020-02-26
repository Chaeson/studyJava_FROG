package chapter6.factoryMethodPattern;

// 팩터리 메서드가 생성할 객체
public class DogToy extends AnimalToy {
    @Override
    void identity() {
        System.out.println("나는 테니스공! 강아지 장난감!");
    }
}
