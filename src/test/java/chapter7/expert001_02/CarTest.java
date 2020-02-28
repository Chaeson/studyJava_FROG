package chapter7.expert001_02;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void 자동차_한국타이어_장착_타이어브랜드_테스트(){
        Tire tire=new KoreaTire();
        Car car = new Car(tire);

        assertEquals("장착된 타이어: Korea Tire",car.getTireBrand());

    }

    @Test
    public void 자동차_미국타이어_장착_타이어브랜드_테스트(){
        Tire tire=new AmericaTire();
        Car car = new Car(tire);

        assertEquals("장착된 타이어: America Tire",car.getTireBrand());
    }

}
