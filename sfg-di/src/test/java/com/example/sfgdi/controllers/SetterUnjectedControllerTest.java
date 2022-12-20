package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterUnjectedControllerTest {

    SetterUnjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterUnjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println( controller.getGreeting());
    }
}