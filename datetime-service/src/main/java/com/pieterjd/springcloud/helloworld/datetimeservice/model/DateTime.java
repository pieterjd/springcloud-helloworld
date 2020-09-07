package com.pieterjd.springcloud.helloworld.datetimeservice.model;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;


public class DateTime {
    private LocalDateTime localDateTime;
    public DateTime(){
        localDateTime = LocalDateTime.now();
    }
    public int getYear() {
        return localDateTime.getYear();
    }

    public Month getMonth() {
        return localDateTime.getMonth();
    }

    public int getHour() {
        return localDateTime.getHour();
    }

    public int getMinute() {
        return localDateTime.getMinute();
    }

    public int getSecond() {
        return localDateTime.getSecond();
    }

    public int getMonthValue() {
        return localDateTime.getMonthValue();
    }

    public int getDayOfYear() {
        return localDateTime.getDayOfYear();
    }

    public DayOfWeek getDayOfWeek() {
        return localDateTime.getDayOfWeek();
    }
}
