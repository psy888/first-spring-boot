package com.brain.firstspringboot.repository;

import com.brain.firstspringboot.model.Taxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class TaxiRepository {
    @Autowired
    List<Taxi> taxiList;

    public Taxi getFreeTaxi(){
        return taxiList.stream()
                .filter(taxi -> taxi.getRestDay()!= LocalDateTime.now().getDayOfWeek())
                .findFirst()
                .orElse(null);
    }
}
