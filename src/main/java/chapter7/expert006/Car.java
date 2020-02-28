package chapter7.expert006;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Car {
    @Autowired
    @Qualifier("mainTire")
    Tire tire;

    public String getTireBrand(){
        return "장착된 타이어: "+tire.getBrand();
    }
}
