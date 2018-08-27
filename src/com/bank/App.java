package com.bank;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Bank bank = new Bank("Bcr");
        bank.addBranch("Bucuresti");
        bank.addCustomer("Bucuresti", "John", 100);
        bank.addCustomer("Bucuresti", "Tim", 500);
        bank.addCustomer("Bucuresti", "Jason", 4000);
        bank.listCustomers("Bucuresti", true);

        bank.addBranch("Cluj");
        bank.addCustomer("Cluj", "Ion", 400);

        bank.addCustomerTransaction("Bucuresti", "Borea", 550);

        System.out.println("===============");
        bank.listCustomers("Bucuresti", true);
    }
}
