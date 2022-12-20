package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

public class PropertyInjctedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
