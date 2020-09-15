package com.pieterjd.springcloud.helloworld.salutationservice.controller;

import com.pieterjd.springcloud.helloworld.salutationservice.model.Salutation;
import com.pieterjd.springcloud.helloworld.salutationservice.service.SalutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/salutation")
public class SalutationController {
    @Autowired
    private SalutationService salutationService;


    @GetMapping("/{name}")
    public Salutation getSalutation(@PathVariable String name, @RequestParam(defaultValue = "false") boolean flaky) {
        return salutationService.getSalutation(name,flaky);
    }
}
