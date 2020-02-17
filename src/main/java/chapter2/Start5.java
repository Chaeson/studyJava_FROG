package chapter2;

public class Start5 {
    static int share;

    public static void main(String[] args){
        share=55;

        int k=fun(5,7);

        System.out.println(share);
    }

    private static int fun(int m, int p){
        share = m+p;

        return m-p;
    }
}

/*
-----------------static----------------|
- Start5
  - share=12--(1-1)
  - main()
  - fun()
- java.util
-------Static-------|-------Heap-------|
|-----fun()---------|
|- share=12---(1-2)-| -->(2-1) 반환후 삭제
|-----main()--------|
|- k=-2 --(2-2)     |
|- args             |
|-------------------|

--> Stack 프레임은 Static 프레임을 참조하여 가공이 가능하다. -> Static영역에 할당된 것은 전역 변수(공유 변수)라고 한다.
   --> 해당 Static영역의 변수는 전체 모든 메소드가 사용이 가능하다. 해당 값은 수정시 데이터가 꼬일 위험이 있으므로 읽기 전용으로만 사용 권장.
--> Stack 프레임 영역의 메소드는 실행 이후 값이 반환되고 스택영역에서 사라진다.
 */
