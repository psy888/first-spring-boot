package com.brain.firstspringboot.repository;

import com.brain.firstspringboot.model.Taxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaxiRepository {
    @Autowired
    List<Taxi> taxiList;
}
