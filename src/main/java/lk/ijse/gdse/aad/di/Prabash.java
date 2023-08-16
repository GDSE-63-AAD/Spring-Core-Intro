package lk.ijse.gdse.aad.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Prabash {
    @Qualifier("Long hair")
    @Autowired
    @PureLove
    private Love love;

    Prabash(){
        System.out.println("Constructor: "+love);
    }
    @PostConstruct
    void initLove(){
        System.out.println("Init value "+love);
        love.marry();
    }

}
