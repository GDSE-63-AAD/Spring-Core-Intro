package lk.ijse.gdse.aad.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Maheshi implements Love{
    @Override
    public void marry() {
        System.out.println("Love");
        System.out.println("Care");

    }
}
