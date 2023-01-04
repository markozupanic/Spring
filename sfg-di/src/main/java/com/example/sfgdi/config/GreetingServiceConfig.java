package com.example.sfgdi.config;

import com.example.sfgdi.services.ConstructorGreetingService;
import com.example.sfgdi.services.PropertyInjectedGreetingService;
import com.example.sfgdi.services.SetterInjectedService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {
    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedService setterInjectedService(){
        return new SetterInjectedService();
    }
}
