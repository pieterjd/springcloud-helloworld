package com.pieterjd.springcloud.helloworld.salutationservice.model;


public class Salutation {
    private String name;
    private String salutation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
