package chapter2;

public class Start3 {
    public static void main(String[] args){
        int i=10;
        int k=20;

        if(i==10){
            int m=k+5;
            k=m;
        }else{
            int p=k+10;
            k=p;
        }

        //k=m+p;


        /*
        --------------Static-----------------
        - Start3 클래스
        - java.util
        ------Stack-------|------heap------
        - -----main()-----|
        - | --if(true)---||
        - | m=? -> 25    ||
        - | -------------||
        - | k=20         ||
        - | i=10         ||
        - | arg          ||
        - ----------------|

        -> if문의 Stack프레임은 사라짐 -> T메모리 소멸 -> JVM기동 중지 -> JRE사용한 시스템 자원 반납
         */
    }
}
