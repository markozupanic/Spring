package com.example.sfgdi.controllers;

import com.example.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjctedControllerTest {

    PropertyInjctedController controller;

    @BeforeEach
    void setUp() {
        controller =new PropertyInjctedController();
        controller.greetingService=new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}