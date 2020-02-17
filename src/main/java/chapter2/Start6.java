package chapter2;

public class Start6 extends Thread{
    static int share;

    public static void main(String[] args){
        Start6 t1 = new Start6();
        Start6 t2 = new Start6();

        t1.start();
        t2.start();
    }

    public void run(){
        for(int count = 0; count < 10; count++){
            System.out.println(share++);

            try {
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
 - 멀티 스레드: 스택영역을 스레드 개수만큼 분할하여 사용.                               -> 스택영역만 분할하여 사용.
 - 멀티 프로세스: 다수의 T메모리 구조(Static, Stack, Heap을 가지는 구조)를 사용한다.     -> 서로 참조 불가능

--> 해당 코드의 문제점은 Static변수는 전역 변수로 여러 스레드가 사용이 가능한데 값을 변경하려고 했다는 것이 문제점.

-----------------static----------------|
- Start6
  - share
  - main()
  - run()
- java.util
-------Static-------|-------Heap-------|
|-----fun()---------| Start6-----------|
|- run() -----------|
|- run() -----------| -----------------|
|-----main()--------| Start6-----------|
|- start()          |                  |
|- start()          | -----------------|
|- args             |
|-------------------|
 */