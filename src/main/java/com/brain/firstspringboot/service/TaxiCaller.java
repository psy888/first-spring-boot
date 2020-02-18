package com.brain.firstspringboot.service;

import com.brain.firstspringboot.component.Person;
import com.brain.firstspringboot.model.Taxi;
import com.brain.firstspringboot.repository.TaxiRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TaxiCaller {

    private final TaxiRepository taxiRepository;

    public void call(Person person) {
        Taxi car = taxiRepository.getFreeTaxi();
        log.info("Call taxi for " + person);
        log.info("Car : " + car);
    }
}
