package com.pieterjd.springcloud.helloworld.datetimeservice.controller;

import com.pieterjd.springcloud.helloworld.datetimeservice.model.DateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/datetime")
public class DateTimeController {

    @GetMapping
    public DateTime getDateTime(){
        return new DateTime();
    }
}
