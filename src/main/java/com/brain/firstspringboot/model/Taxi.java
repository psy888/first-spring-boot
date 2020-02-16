package com.brain.firstspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.DayOfWeek;

@AllArgsConstructor
@Data
public class Taxi {
    private String car;
    private String carNumber;
    private String driverName;
    private DayOfWeek restDay;
}
