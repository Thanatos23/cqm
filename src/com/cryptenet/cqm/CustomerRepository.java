package com.cryptenet.cqm;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {
//    public Map<String, Customer> getData() {
    public Map<String, Customer> getCustomerDetails() {
//        Map<String, Customer> data = new HashMap<>();
        Map<String, Customer> details = new HashMap<>();

        details.put("jk", new Customer("1", "John", "Hamilton", 25));
        details.put("nl", new Customer("1", "Nora", "Luxemburg", 29));
        details.put("jw", new Customer("1", "Joseph", "Windigo", 36));
        details.put("mf", new Customer("1", "Marie", "Fanning", 22));

        return details;
    }
}
