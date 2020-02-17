package chapter2;

public class Start {
    public static void main(String[] args){
        System.out.println("Hello OOP!!!");

        // Static 영역
        // -- java.util(기본)
        // -- Start 클래스
        // Stack영역                  // Heap영역
        // main 메소드(args도 같이...)
        // -> 메소드 종료시 같이 사라짐

        // 요약
        //    Static영역에 올라가는 영역은 클래스, static 메소드,
        //    import한 클래스, 따라서 정말 필요한 것만 임포트하자... '*'쓰면 불필요한 것도 올라감..
    }
}
