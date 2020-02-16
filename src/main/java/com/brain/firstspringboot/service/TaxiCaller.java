package com.brain.firstspringboot.service;

import com.brain.firstspringboot.component.Person;
import org.springframework.stereotype.Service;

@Service
public class TaxiCaller {

    public void call(Person person){
        System.out.println("Call taxi for " + person);
    }
}
