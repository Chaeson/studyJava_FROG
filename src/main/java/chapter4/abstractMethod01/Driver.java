package chapter4.abstractMethod01;

public class Driver {
    public static void main(String[] args){
        Animal[] animals=new Animal[5];

        animals[0]=new Mouse();
        animals[1]=new Cat();
        animals[2]=new Dog();
        animals[3]=new Calf();
        animals[4]=new Chick();

        for(int i=0; i<animals.length; i++){
            animals[i].cry();
        }
        Animal animal=new Animal();
        animal.cry();
    }
}
/*
Animal 클래스의 cry메소드 호출시 어떤 값을 내보내야 하나?
각 동물마다 우는 소리는 있다. 모두 각기 다른 소리를 내기 때문에 해당 cry()메소드는 추상 메소드(선언부만 있고, 구현은 하지 않은 메소드)로 구현하는 것이 옳다.
 */