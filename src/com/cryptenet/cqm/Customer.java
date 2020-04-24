package com.cryptenet.cqm;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private int age;

    public Customer(String id, String firstName, String lName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lName;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
