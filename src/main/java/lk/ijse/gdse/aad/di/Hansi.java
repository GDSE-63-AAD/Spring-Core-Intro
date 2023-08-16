package lk.ijse.gdse.aad.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Long hair")
@PureLove
public class Hansi implements Love{
    @Override
    public void marry() {
        System.out.println("Love");
        System.out.println("Care");
        System.out.println("Kind");
        System.out.println("Intelligent");
    }
}
