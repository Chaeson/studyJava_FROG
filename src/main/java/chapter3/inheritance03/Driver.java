package chapter3.inheritance03;

public class Driver {
    public static void main(String[] args){
        Penguin pororo = new Penguin();

        pororo.name="뽀로로";
        pororo.habitat="남극";

        pororo.showName();
        pororo.showHabitat();
        //-----
        /*
        Penguin 클래스는 Animal 클래스의 내용의 한 분류로 속하면서 Animal 클래스의 내용을 확장하여 사용가능하다.
        따라서 Animal 클래스에서만 사용하는 Static 프레임의 내용도 사용이 가능한 것이다.
         */
        //-----
        Animal pingu = new Penguin();

        pingu.name="핑구";
        // pingu.habitat="EBS";

        pingu.showName();
        // pingu.showHabitat();
        //-----
        /*
        Animal 클래스는 Penguin 클래스의 내용만 불러오도록 사용한다.
        Animal 클래스로 Penguin 클래스를 생성하여도 Animal pingu 변수의 접근은 Animal로 접근하므로 Animal 클래스의 내용만 접근이 가능하다.
        따라서, Penguin 클래스의 내용을 Animal 클래스는 확장하도록 사용하지않았으므로 사용이 불가능 하다.
         */
        //-----

        //Penguin happyfeet = new Animal();
        //-----
        /*
        하위 클래스는 상위 클래스의 내용을 참조 할 수 없다. 형변환이 답...
        하지만 하더라도 Penguin 을 Animal 클래스로 형변환 하여 사용하여야 한다.
        따라서 pingu와 같이 habitat 관련하여 사용은 못한다.
         */
        //-----
    }
}
