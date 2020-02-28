package chapter7.expert002;


import chapter7.expert001_03.AmericaTire;
import chapter7.expert001_03.Car;
import chapter7.expert001_03.KoreaTire;
import chapter7.expert001_03.Tire;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void 자동차_한국타이어_장착_타이어브랜드_테스트() {
        chapter7.expert001_03.Tire tire = new KoreaTire();
        chapter7.expert001_03.Car car = new chapter7.expert001_03.Car();
        car.setTire(tire);

        assertEquals("장착된 타이어: Korea Tire",car.getTireBrand());
    }

    @Test
    public void 자동차_미국타이어_장착_타이어브랜드_테스트() {
        Tire tire = new AmericaTire();
        chapter7.expert001_03.Car car = new Car();
        car.setTire(tire);

        assertEquals("장착된 타이어: America Tire",car.getTireBrand());
    }
}
