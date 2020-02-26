package chapter6.templateCallbackPattern;

public class Client {
    public static void main(String[] args){
        Soldier rambo = new Soldier();

        rambo.runContext(" 총! 총조종총 총! 총! ");

        System.out.println();

        rambo.runContext(" 칼! 카가갈 칼! 칼! ");

        System.out.println();

        rambo.runContext(" 도끼! 도독.. 도도독 독끼! ");
    }
}
/*
- 전략 패턴에서 생성하는 전략을 익명 내부 틀래스로 정의해서 사용하는 특징
- 실행의 주가 되는 클래스에서 익명 내부 클래스를 사용할 경우 중복되는 소스 코드가 많을 수도 있어 해당 중복 로직의 경우 템플릿 패턴화 한다.
- 전략을 익명 내부 틀래스로 구현한 전략 패턴(익명 내부 클래스중 공통로직은 템플릿화)
- OCP/DIP
 */