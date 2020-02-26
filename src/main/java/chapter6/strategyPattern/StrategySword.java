package chapter6.strategyPattern;

public class StrategySword implements Strategy {

    // 검 사용 전략 클래스
    @Override
    public void runStrategy() {
        System.out.println("창... 채재챙 챙챙!");
    }
}
