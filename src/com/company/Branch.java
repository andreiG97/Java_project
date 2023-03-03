package com.company;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customersList;

    public Branch(String name) {
        this.name = name;
        this.customersList = new ArrayList<Customer>();
    }

    public String getName(){
        return this.name;
    }

    public String getCustomersList() {
        return customersList.toString();
    }

    public boolean addNewCustomer(String customerName, double initialAmount ){
        if(findCustomer(customerName) >= 0){
            System.out.println("There is already a customer with this name");
            return false;
        }else{

            this.customersList.add(new Customer(customerName, initialAmount));

            return true;
        }
    }

    public boolean addNewCustomerTransaction(String customerName, double amount ){
        int indexC = findCustomer(customerName);
        if(indexC >= 0){
            Customer c = this.customersList.get(indexC);
            c.setTransactions(amount);
            return true;
        }else{
            System.out.println("No such customer");
            return false;
        }
    }

    private int findCustomer(String name){
        int position = customersList.indexOf(name);
        return position;
    }
}
