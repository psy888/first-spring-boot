package com.brain.firstspringboot.service;

import com.brain.firstspringboot.component.Person;
import com.brain.firstspringboot.model.Taxi;
import com.brain.firstspringboot.repository.TaxiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaxiCaller {

    private final TaxiRepository taxiRepository;

    public void call(Person person){
        Taxi car= taxiRepository.getFreeTaxi();
        System.out.println("Call taxi for " + person);
        if(car!=null) {
            System.out.println("Car : "+ car);
        }else{
            System.out.println("No free cars today!");
        }
    }
}
