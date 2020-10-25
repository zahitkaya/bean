package com.example.bean.configuration_bean;

import org.springframework.stereotype.Component;


public class Address {
    private String street;
    private int number;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

}
