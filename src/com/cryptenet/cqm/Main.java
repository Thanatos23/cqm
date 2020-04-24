package com.cryptenet.cqm;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepository();

//        Map<String, Customer> d = repository.getData();
//
//        Map<String, Customer> data = repository.getData();
//
//        Map<String, Customer> customerDetails = repository.getData();

        Map<String, Customer> customerDetails = repository.getCustomerDetails();
    }
}
