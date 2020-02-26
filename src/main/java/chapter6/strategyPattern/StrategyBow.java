package chapter6.strategyPattern;

public class StrategyBow implements Strategy {
    // 활 사용 전략 클래스
    @Override
    public void runStrategy() {
        System.out.println("슝~ 쌔액~ 쉑, 최종 병기");
    }
}
