package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.config.ApplicationConfig;
import lk.ijse.gdse.aad.lifecycle.LifeCycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.register(ApplicationConfig.class);
        ctx.refresh();
        LifeCycle lifeCycle = (LifeCycle) ctx.getBean("lifeCycle");
        System.out.println(lifeCycle);
        ctx.close();
    }
}
