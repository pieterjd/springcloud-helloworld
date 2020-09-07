package com.pieterjd.springcloud.helloworld.salutationservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class BeanConfig {
    @Bean
    public Random getRandom(){
        return new Random();
    }
}
