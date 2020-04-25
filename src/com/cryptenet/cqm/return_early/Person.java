package com.cryptenet.cqm.return_early;

import com.sun.jdi.event.StepEvent;

public class Person {
    private String name;
    private int age;
    private int pin;
    private int balance;

    public Person(String name, int pin) {
        this(name, 18, pin, 500);
    }

    public Person(String name, int age, int pin, int balance) {
        this.name = name;
        this.age = age;
        this.pin = pin;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public String getPersonalInfo() {
        return "Name: " + this.name + "\t Balance: " + this.balance;
    }
}
