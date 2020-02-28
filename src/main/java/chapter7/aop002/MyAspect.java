package chapter7.aop002;

// 스프링 프레임 워크에 종속되는 JAVA

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("execution(* runSomething())")
    public void before(JoinPoint joinPoint){
        System.out.println(joinPoint.toLongString());
        System.out.println("얼굴 인식 확인: 문을 개방하라.");
    }
}
