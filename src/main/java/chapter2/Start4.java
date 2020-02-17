package chapter2;

public class Start4 {
    public static void main(String[] args){
        int k=5;
        int m;

        m=square(k);
    }

    private static int square(int k){
        int result;

        k=25;

        result=k;

        return result;
    }
}
/*
        --------------Static-----------------
        - Start4 클래스
        - java.util
        ------Stack-------|------heap------
        - | --square()---||
        - | k=5          ||
        - | result -> 25 ||
        - | -------------||
        - -----main()-----|
        - | m            ||
        - | k=5          ||
        - | arg          ||
        - |--------------||
        - ----------------|

        -> method 호출시 Stack프레임에 새로운 영역을 할당한다.
        -> 서로의 스택 프레임이 달라 각 메소드의 해당 값에 대해 참조 불가능
        * Call By Value ?
          -> 메소드를 통해 나온 결과값 자체만 복사하여 전달하는 경우.
*/
