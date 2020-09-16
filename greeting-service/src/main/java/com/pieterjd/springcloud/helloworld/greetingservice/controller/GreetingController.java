package com.pieterjd.springcloud.helloworld.greetingservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pieterjd.springcloud.helloworld.greetingservice.model.Greeting;
import com.pieterjd.springcloud.helloworld.greetingservice.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @GetMapping("/{name}")
    @HystrixCommand(fallbackMethod = "getGreetingFallback")
    public Greeting getGreeting(@PathVariable String name) {
        return greetingService.greet(name);
    }

    public Greeting getGreetingFallback(@PathVariable String name){
        return greetingService.greetFallback(name);
    }
}
