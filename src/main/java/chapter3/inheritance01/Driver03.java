package chapter3.inheritance01;

public class Driver03 {
    public static void main(String[] args){
        동물[] animals=new 동물[7];
        animals[0]=new 동물();
        animals[1]=new 포유류();
        animals[2]=new 조류();
        animals[3]=new 고래();
        animals[4]=new 박쥐();
        animals[5]=new 참새();
        animals[6]=new 펭귄();

        for(int index=0; index<animals.length; index++){
            animals[index].showMe();
        }
    }
}
/*
해당 결과를 기준으로 확인해보면 동물 클래스는 최상위클래스 이다. 해당 최상위 클래스를 상속받은 클래스들이다.
하위 클래스들은 모두 동물 클래스의 showMe 메소드를 상속받기 때문에 사용 가능하게 된다.
하위 클래스는 상위 클래스의 함수를 자동적으로 오버로딩 가능하고 변경시에 필요에따라 오버라이딩 하면 된다.
 */