package com.pieterjd.springcloud.helloworld.salutationservice.controller;

import com.pieterjd.springcloud.helloworld.salutationservice.model.Salutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/salutation")
public class SalutationController {

    @Autowired
    private Random random;

    @GetMapping("/{name}")
    public Salutation getSalutation(@PathVariable String name){
        Salutation salutation = new Salutation();
        salutation.setName(name);
        salutation.setSalutation(random.nextBoolean() ? "Mr" : "Ms");
        return salutation;
    }
}
