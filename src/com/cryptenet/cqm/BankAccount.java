package com.cryptenet.cqm;

public class BankAccount {
    private double balance;
    private double interest;

//    public BankAccount() {
//    }
//
//    public BankAccount(double balance) {
//        this.balance = balance;
//    }
//
//    public BankAccount(double balance, double interest) {
//        this.balance = balance;
//        this.interest = interest;
//    }

//    public BankAccount() {
//    }
//
//    public BankAccount(double balance) {
//        if (balance < 0) {
//            throw new IllegalArgumentException("balance can not be less than 0");
//        }
//
//        this.balance = balance;
//    }
//
//    public BankAccount(double balance, double interest) {
//        if (interest < 0) {
//            throw new IllegalArgumentException("interest cannot be less than 0");
//        }
//
//        if (balance < 0) {
//            throw new IllegalArgumentException("balance cannot be less than 0");
//        }
//
//        this.balance = balance;
//        this.interest = interest;
//    }


    public BankAccount() {
        this(0.0);
    }

    public BankAccount(double balance) {
        this(balance, 0.10);
    }

    public BankAccount(double balance, double interest) {
        if (interest < 0) {
            throw new IllegalArgumentException("interest cannot be less than 0");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("balance cannot be less than 0");
        }

        this.balance = balance;
        this.interest = interest;
    }
}
