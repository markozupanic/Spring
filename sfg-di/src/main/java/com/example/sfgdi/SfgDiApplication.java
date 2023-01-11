package com.example.sfgdi;

import com.example.sfgdi.controllers.*;
import com.example.sfgdi.services.PrototypeBean;
import com.example.sfgdi.services.SingeltonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.example.sfgdi","com.springframework.pets"})
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        I18nController i18nController=(I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayGreeting());

        MyController myController= (MyController) ctx.getBean("myController");

        System.out.println("------- Primary Bean");
        System.out.println(myController.sayHello());


        System.out.println("--------- Property");
        PropertyInjctedController propertyInjctedController=(PropertyInjctedController) ctx.getBean("propertyInjctedController");
        System.out.println(propertyInjctedController.getGreeting());

        System.out.println("---------- Setter");
        SetterUnjectedController setterUnjectedController=(SetterUnjectedController) ctx.getBean("setterUnjectedController");
        System.out.println(setterUnjectedController.getGreeting());

        System.out.println("------------- Constructor");
        ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("----- Bean scope ---------");
        SingeltonBean singeltonBean=ctx.getBean(SingeltonBean.class);
        System.out.println(singeltonBean.getMyScope());
        SingeltonBean singeltonBean2=ctx.getBean(SingeltonBean.class);
        System.out.println(singeltonBean2.getMyScope());

        PrototypeBean prototypeBean=ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean.getMyScope());
        PrototypeBean prototypeBean1=ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());




    }

}
