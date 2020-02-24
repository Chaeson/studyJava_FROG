package chapter3.polymorphism01;

public class Driver {
    public static void main(String[] args){
        Penguin pororo = new Penguin();

        pororo.name="뽀로로";
        pororo.habitat="남극";

        pororo.showName();
        pororo.showName("초보람보");
        pororo.showHabitat();

        Animal pingu = new Penguin();

        pingu.name="핑구";
        pingu.showName();
    }
}
/*
- pororo는 Penguin의 클래스를 할당, Animal 클래스의 showName메소드를 할당 받는다.
- pingu는 Animal클래스의 영역만 사용가능하다.
- L:10 -> Animal의 showName(), Penguin의 showName()호출시 Animal의 클래스를 확장하여 사용하므로 Penguin영역의 showName사용.
- L:11 -> Penguin클래스의 오버라이딩한 showName(String) 을 사용하는 건 당연... Animal에는 없다!
- L:12 -> Animal의 name 변수사용 가능, Penguin클래스의 habitat 변수 사용가

의문점!
pingu는 Animal클래스이지만 Penguin클래스를 사용한다. 실질적으로 사용가능한영역은 Animal클래스영역 내이다.
그말인 즉, pingu는 참조하는 클래스는 Animal클래스로 habitat관련 클래스의 내용을 참조하지 못함.
근데 왜? showName을 했을때 Penguin클래스의 showName메소드를 호출하나?
JAVA특성상 상위클래스 타입의 객체변수 참조하더라도 하위 클래스에서 오버라이딩한 메서드가 호출된다.
showName 메소드는 상위(Animal), 하위(Penguin) 클래스 모두 있다. showName은 오버로딩한 메소드의 영역으로 해당 클래스 마다 모두
가지고 있는 내용이지만 오버라이딩한 메소드의 내용을 호출한다는 점! -> 다형성의 특징
 */