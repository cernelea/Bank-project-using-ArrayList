package com.bank;

import java.util.ArrayList;

public class Customer {

    String name;
    ArrayList<Double> transactionList;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactionList = new ArrayList<>();
        addTransaction(initialAmount);
    }
    public void setTransactionList(ArrayList<Double> transactionList) {
        this.transactionList = transactionList;
    }

    public void addTransaction(double amount) {
        this.transactionList.add(amount);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }


}
