package com.example.bean.configuration_bean;

public class Contact {
    private String operator;
    private int telNumber;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

    public Contact(String operator, int telNumber) {
        this.operator = operator;
        this.telNumber = telNumber;
    }
}
