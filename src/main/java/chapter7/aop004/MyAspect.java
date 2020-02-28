package chapter7.aop004;

// POJO & XML 기반

import org.aspectj.lang.JoinPoint;

public class MyAspect {
    public void before(JoinPoint joinPoint){
        System.out.println("얼굴 인식 확인: 문을 개방하라.");
    }

    public void after(JoinPoint joinPoint) { System.out.println("주인 나갔다 문을 닫자."); }
}
