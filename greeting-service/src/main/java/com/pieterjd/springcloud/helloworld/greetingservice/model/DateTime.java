package com.pieterjd.springcloud.helloworld.greetingservice.model;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;


public class DateTime {

    private int year, hour, minute, second, dayOfYear;

    public DateTime(){

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }
    public String toString(){
        return String.format("%d:%d:%d",getHour(),getMinute(),getSecond());
    }
}
