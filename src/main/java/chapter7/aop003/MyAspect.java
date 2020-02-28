package chapter7.aop003;

// POJO & XML 기반

import org.aspectj.lang.JoinPoint;

public class MyAspect {
    public void before(JoinPoint joinPoint){
        System.out.println("얼굴 인식 확인: 문을 개방하라.");
    }
}
