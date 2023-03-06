package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Bank bank = new Bank("ING");
    bank.addBranch("Expozitiei");
    bank.addCustomer("Expozitiei", "Paco", 100000);
    bank.addCustomer("Expozitiei", "Dumbo", 100500);
    bank.addBranch("Sibiu");
    bank.addCustomer("Sibiu", "Paty", 20500);
    bank.addCustomerTransaction("Sibiu", "Paty", 500);

    bank.listCustomers("Sibiu", true);
    bank.listCustomers("Expozitiei", false);
    }
}