package lk.ijse.gdse.aad.config;

import lk.ijse.gdse.aad.sample.MyBean;
import lk.ijse.gdse.aad.sample.MyComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.aad")
// if not add @ComponentScan only take object instances annotated from @Bean
public class ApplicationConfig {
//  public MyBean myBean(){
//      return new MyBean();
//  }
//
//  public Sample sample(){
//        return new Sample();
//  }
}
