package chapter6.strategyPattern;

public class StrategyGun implements Strategy {
    // 총 사용을 위한 전략
    @Override
    public void runStrategy() {
        System.out.println("탕, 타당, 타다당!");
    }
}
