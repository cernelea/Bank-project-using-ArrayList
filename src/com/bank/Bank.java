package com.bank;

import java.util.ArrayList;

public class Bank {

    String name;
    private ArrayList<Branch> branchList;

    public Bank(String name) {
        this.name = name;
        this.branchList = new ArrayList<>();
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {

            this.branchList.add(new Branch(branchName));
            return true;

        }

        return false;

    }

    public boolean addCustomer(String branchName, String customerName, double amount) {
        if (findBranch(branchName) != null) {
            Branch foundedBranch = findBranch(branchName);

            return foundedBranch.addCustomer(customerName, amount);
        }

        return false;

    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount) {
        if (findBranch(branchName) != null) {
            Branch foundedBranch = findBranch(branchName);
            return foundedBranch.addCustomerTransaction(customerName, transactionAmount);

        }
        return false;

    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branchList) {
            if (branch != null && branch.getName().equals(branchName)) {
                return branch;
            }

        }
        return null;

    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        if (this.findBranch(branchName) != null) {
            Branch foundedBranch = findBranch(branchName);
            System.out.println("Customer details for branch" + foundedBranch.getName());
            ArrayList<Customer> branchCustomers = foundedBranch.getCustomerList();
            for (Customer customer : branchCustomers) {

                System.out.println("Customer: " + customer.getName());

                if (showTransactions) {
                    System.out.println("Transactions");

                    ArrayList<Double> transactions = customer.getTransactionList();
                    for (Double transaction : transactions) {

                        System.out.println("Amount " + transaction);

                    }

                }

            }
            return true;
        } else {
            return false;
        }
    }

}
