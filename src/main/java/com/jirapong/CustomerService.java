package com.jirapong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService {

    private Map<String, Customer> customerMap = new HashMap<>();

    public void addCustomer(Customer customer) {
        if (customerMap.containsKey(customer.getId())) {
            throw new IllegalArgumentException("Customer already exists");
        }
        customerMap.put(customer.getId(), customer);
    }

    public Customer getCustomer(String id) {
        return customerMap.get(id);
    }

    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerMap.values());
    }

    public void deleteCustomer(String id) {
        customerMap.remove(id);
    }

}
