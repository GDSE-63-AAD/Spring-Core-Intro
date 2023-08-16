package lk.ijse.gdse.aad.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Long hair")
public class Christeen implements Love{
    @Override
    public void marry() {
        System.out.println("Love");
        System.out.println("Intelligent");

    }
}
