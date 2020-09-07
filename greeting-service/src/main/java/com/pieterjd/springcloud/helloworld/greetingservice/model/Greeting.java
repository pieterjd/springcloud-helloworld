package com.pieterjd.springcloud.helloworld.greetingservice.model;

import javax.xml.crypto.Data;

public class Greeting {
    private Salutation salutation;
    private DateTime dateTime;
    private String greeting;

    public Salutation getSalutation() {
        return salutation;
    }

    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
