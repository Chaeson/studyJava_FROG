package chapter3;

public class MouseDriver {
    public static void main(String[] args){
        Mouse mickey=new Mouse();

        mickey.name="미키";
        mickey.age=85;
        mickey.countOfTail=1;

        mickey.sing();

        mickey=null;

        Mouse jerry=new Mouse();

        jerry.name="제리";
        jerry.age=73;
        jerry.countOfTail=1;

        jerry.sing();
    }
}
/*
-----------------static----------------|
- MouseDriver          | Mouse  -> name, age, countOfTail의 변수 저장공간 X
- java.util            |
-------Static----------|-------Heap-------|
|-----main()-----------| - Mouse
|- jerry (Mouse 번지수)--|   - age
|- mickey (Mouse 번지수)-|   - name
|- args                |   - countOfTail
|----------------------|   - sing()          -> Heap: 대용량 자료를 저장할 수 있도록 메모리를 사용하는 방식

--> L:13 실행 후 mickey 인스턴스는 번지수를 반환하고 가비지 컬렉터가 회수.
--> L:15 에서 jerry 인스턴스가 새로운 번지수를 참조함.
 */

