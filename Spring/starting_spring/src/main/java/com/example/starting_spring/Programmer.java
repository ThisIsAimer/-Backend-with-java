package com.example.starting_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //it tells spring that it can access this class
public class Programmer {

    @Autowired//we are wiring our programmer and laptop
    Laptop lap;

    public void code(){
        System.out.println("coding");
    }


    public void compiling(){
    lap.compile();
    }
}
