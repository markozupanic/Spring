package com.example.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingeltonBean {

    public  SingeltonBean(){
        System.out.println("Creating a Singelton bean");
    }

    public String getMyScope(){
        return "I m a Singleton";
    }

}
