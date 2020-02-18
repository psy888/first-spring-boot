package com.brain.firstspringboot.repository;

import com.brain.firstspringboot.model.Taxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

import static java.util.Objects.isNull;

@Repository
public class TaxiRepository {
    @Autowired
    List<Taxi> taxiList;

    public Taxi getFreeTaxi(){
        if(isNull(taxiList))
            throw new RuntimeException("No taxi list");
        if(taxiList.isEmpty())
            throw new RuntimeException("Taxi list is empty");
        DayOfWeek today = LocalDateTime.now().getDayOfWeek();
        return taxiList.stream()
                .filter(taxi -> taxi.getRestDay()!= today)
                .findFirst()
                .orElseThrow(()->new RuntimeException("No free cars"));
    }
}
