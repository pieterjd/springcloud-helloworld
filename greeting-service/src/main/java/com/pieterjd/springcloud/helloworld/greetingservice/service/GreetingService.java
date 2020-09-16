package com.pieterjd.springcloud.helloworld.greetingservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pieterjd.springcloud.helloworld.greetingservice.model.DateTime;
import com.pieterjd.springcloud.helloworld.greetingservice.model.Greeting;
import com.pieterjd.springcloud.helloworld.greetingservice.model.Salutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService {
    @Autowired
    private RestTemplate restTemplate;

    public Greeting greet(String name){
        Salutation salutation = getSalutation(name);
        DateTime dt = getDateTime();
        return Greeting.builder()
                .salutation(salutation)
                .dateTime(dt)
                .greeting(String.format("Hello %s %s it is now %s",salutation.getSalutation(),name,getDateTime().toString()))
                .build();
    }

    public Greeting greetFallback(String name){
        return Greeting.builder()
                .dateTime(getDateTime())
                .salutation(getFallbackSalutation(name))
                .greeting("Fallbacked greeting")
                .build();
    }

    private DateTime getDateTime(){
        return restTemplate.getForObject("http://datetime-service/datetime", DateTime.class);
    }

    private Salutation getSalutation(String name){
        return restTemplate.getForObject(String.format("http://salutation-service/salutation/%s",name), Salutation.class);
    }

    private Salutation getFallbackSalutation( String name){
        return Salutation.builder()
                .name(name)
                .salutation("Fallbacked")
                .build();
    }
}
