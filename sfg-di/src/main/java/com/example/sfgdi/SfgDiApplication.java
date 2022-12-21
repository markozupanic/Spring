package com.example.sfgdi;

import com.example.sfgdi.controllers.ConstructorInjectedController;
import com.example.sfgdi.controllers.MyController;
import com.example.sfgdi.controllers.PropertyInjctedController;
import com.example.sfgdi.controllers.SetterUnjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
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


    }

}
