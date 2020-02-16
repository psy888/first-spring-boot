package com.brain.firstspringboot.component;

import com.brain.firstspringboot.service.TaxiCaller;

public class Person {
    private String name;
    private String phone;

    private TaxiCaller taxiCaller;

    public void goTaxi(){
        taxiCaller.call(name);
    }
}
