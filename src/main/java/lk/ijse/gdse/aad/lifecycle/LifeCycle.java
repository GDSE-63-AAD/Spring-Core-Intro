package lk.ijse.gdse.aad.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class LifeCycle implements
        BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean

{
    public LifeCycle(){
        System.out.println("Hello LifeCycle");
    }
    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name is "+ s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Set bean factory and it is "+beanFactory);
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("My application contex is "+applicationContext);
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I'm ready........");
    }
    @PostConstruct
    public void myMethodOne(){
        System.out.println("My Method One - Post Construct");
    }
    @PreDestroy
    public void myMethodTwo(){
        System.out.println("My Method Two - Pre Destroy");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Man yanooooooo");
    }


}
