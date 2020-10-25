package com.example.bean.configuration_bean;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private Address address;
    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Person(Address address, Contact contact) {
        this.address = address;
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
