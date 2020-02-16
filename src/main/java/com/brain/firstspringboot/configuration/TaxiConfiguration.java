package com.brain.firstspringboot.configuration;

import com.brain.firstspringboot.model.Taxi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.util.List;

@Configuration
public class TaxiConfiguration {

    @Bean
    public List<Taxi> taxiList(){
        return Lists.newArrayList(
                new Taxi("Lanos","AP1234AA", "Jack", DayOfWeek.SATURDAY),
                new Taxi("Aveo","AP4321AA", "Tim", DayOfWeek.WEDNESDAY),
                new Taxi("Camry","AP4213AA", "Ben", DayOfWeek.MONDAY),
                new Taxi("Corolla","AP3142AA", "Rik", DayOfWeek.FRIDAY)
        );
    }
}
