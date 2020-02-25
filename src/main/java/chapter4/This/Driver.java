package chapter4.This;

class Penguin {
    int var =10;

    void test(){
        int var=20;

        System.out.println(var);        //지역변수 var가 우선
        System.out.println(this.var);   //객체변수 var가 우선
    }
}

public class Driver{
    public static void main(String[] args){
        Penguin pororo=new Penguin();
        pororo.test();
    }
}

/*
참고사항:
- 지역 변수와 객체 변수의 이름이 같은 경우 지역변수가 우선
- 이름이 동일한 객체변수를 사용할떄 this라는 키워드를 사용
- 정적 변수와 이름이 같은 지역변수가 있는 경우 정적 변수 사용시 클래스명을 접두사로 넣는다.
 */