package chapter6.templateMethodPattern;

public class Driver {
    public static void main(String[] args){
        Animal bolt = new DogTemplate();
        Animal kitty = new CatTemplate();

        bolt.playWithOwner();

        System.out.println("\n");

        kitty.playWithOwner();
    }
}
/*
- 상위 클래스의 견본 메서드에서 하위 클래스가 오버라이딩한 메서드를 호출.
- 상위 클래스에 공통 로직을 수행(템플릿 메서드)와 하위 클래스에 오버라이딩을 강제하는 추상 메서드 또는 선택적으로 오버라이딩 할 수 있는 훅 메서드를 두는 패턴
- 공통 로직 수행 로직 + 오버라이딩을 선택 혹은 필수로 진행하는 로직이 있는 패턴
- DIP
 */