package com.pieterjd.springcloud.helloworld.salutationservice.service;

import com.pieterjd.springcloud.helloworld.salutationservice.model.Salutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Service
public class SalutationService {
    @Autowired
    private Random random;

    public Salutation getSalutation( String name,boolean flaky){
        if(flaky && random.nextBoolean()){
            throw new RuntimeException("Flaky SalutationService acting up :/");
        }
        Salutation salutation = new Salutation();
        salutation.setName(name);
        salutation.setSalutation(random.nextBoolean() ? "Mr" : "Ms");
        return salutation;
    }

    public Salutation getSalutation(String name){
        return getSalutation(name, false);
    }
}
