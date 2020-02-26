package chapter6.strategyPattern;

// 클라이언트 클래스(전략 생성 및 컨텍스트 주입)
public class Client {
    public static void main(String[] args){
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        // 총을 람보에게 전달해서 전투를 수행
        strategy = new StrategyGun();
        rambo.runContext(strategy);

        System.out.println();

        // 검을 람보에게...
        strategy = new StrategySword();
        rambo.runContext(strategy);

        System.out.println();

        // 활을 람보에게...
        strategy = new StrategyBow();
        rambo.runContext(strategy);
    }
}
/*
- 패턴의 꽃
- 클라이언트(실행 주체 클래스)가 전략(생성자 등)을 생성해 전략을 실행할 컨텍스트(전략을 수행하는 로직 메서드)에 주입하는 패턴
- OCP / DIP
 */