package com.example.sfgdi.config;

import com.example.sfgdi.repositories.EnglishGreeting;
import com.example.sfgdi.repositories.EnglishGreetingImpl;
import com.example.sfgdi.services.*;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService petService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }

    @Profile({"ES","default"})
    @Bean("i18nService")
    I18nSpanishService i18nSpanishService(){
        return new I18nSpanishService();
    }

    @Bean
    EnglishGreeting englishGreeting(){
        return new EnglishGreetingImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreeting englishGreeting){
        return new I18nEnglishGreetingService(englishGreeting);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

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
