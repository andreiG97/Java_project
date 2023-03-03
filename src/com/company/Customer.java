package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        setTransactions(initialAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(double transactions) {
        this.transactions.add(transactions);
    }

    public String showCustomer(){
        return this.name;
    }

    public String toString(){
        return this.name + this.transactions;
    }
}
