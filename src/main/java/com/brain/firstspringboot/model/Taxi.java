package com.brain.firstspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.DayOfWeek;

@AllArgsConstructor
@Data
@ToString
public class Taxi {
    private String car;
    private String carNumber;
    private String driverName;
    private DayOfWeek restDay;
}
