package com.brain.firstspringboot.model;

import lombok.AllArgsConstructor;

import java.time.DayOfWeek;

@AllArgsConstructor
public class Taxi {
    private String car;
    private String carNumber;
    private String driverName;
    private DayOfWeek restDay;
}
