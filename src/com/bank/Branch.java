package com.bank;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customerList;

    public Branch(String name) {
        this.name = name;
        this.customerList = new ArrayList<>();
    }

    public boolean addCustomer(String name, double initialAmount) {
        Customer customer = new Customer(name, initialAmount);
        if (findCustomer(name) == null) {

            this.customerList.add(customer);
            return true;
        } else {
            return false;

        }

    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        if (findCustomer(customerName) != null) {
            Customer existingCustomer = findCustomer(customerName);
            existingCustomer.addTransaction(amount);
            return true;

        }

        return false;

    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customerList) {
            if (customer != null && customer.getName().equals(customerName)) {
                return customer;
            }

        }
        return null;

    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

}
