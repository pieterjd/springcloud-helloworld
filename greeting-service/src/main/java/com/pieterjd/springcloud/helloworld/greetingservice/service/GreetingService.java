package com.pieterjd.springcloud.helloworld.greetingservice.service;

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
        Greeting greeting = new Greeting();
        greeting.setDateTime(dt);
        greeting.setSalutation(salutation);
        greeting.setGreeting(String.format("Hello %s %s it is now %s",salutation.getSalutation(),name,getDateTime().toString()));
        return greeting;
    }

    private DateTime getDateTime(){
        return restTemplate.getForObject("http://datetime-service/datetime", DateTime.class);
    }

    private Salutation getSalutation(String name){
        return restTemplate.getForObject(String.format("http://salutation-service/salutation/%s",name), Salutation.class);
    }
}
