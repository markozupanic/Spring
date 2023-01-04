package com.example.sfgdi.services;

import com.example.sfgdi.repositories.EnglishGreeting;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class I18nEnglishGreetingService implements GreetingService{

    private final EnglishGreeting englishGreeting;

    public I18nEnglishGreetingService(EnglishGreeting englishGreeting) {
        this.englishGreeting = englishGreeting;
    }

    @Override
    public String sayGreeting() {
        return "Hello world--EN";
    }
}
