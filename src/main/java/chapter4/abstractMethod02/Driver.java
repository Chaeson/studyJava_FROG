package chapter4.abstractMethod02;


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

        //Animal beast=new Animal();
    }
}
/*
추상클래스(Abstract Class)
- 모든 클래스가 해당 클래스의 내용을 반드시 오버라이딩 해야 할때사용한다.

특징
 - 객체 생성 불가능.
 - 강제적인 오버라이딩
 - 반드시 추상클래스여야함.
 */
