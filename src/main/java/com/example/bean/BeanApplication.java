package com.example.bean;

import com.example.bean.configuration_bean.Address;
import com.example.bean.configuration_bean.Config;
import com.example.bean.configuration_bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanApplication {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Person person=context.getBean(Person.class);
        System.out.println(person.getAddress().getStreet());//Fatih
        System.out.println(person.getContact().getOperator());//Turkcell

    }

}
