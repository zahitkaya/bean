package com.example.bean.configuration_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Person.class)
public class Config {
    @Bean
    public Address getAddress(){
        return new Address("Fatih",5);
    }
    @Bean
    public Contact getContact(){
        return new Contact("Turkcell",507962);
    }

}
