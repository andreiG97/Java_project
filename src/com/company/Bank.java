package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public boolean addBranch(String branchName){
        Branch newBranch = new Branch(branchName);
        if(findBranch(branchName) == null){
            this.branches.add(newBranch);
            return true;
        }else{
            System.out.println("Already existent Branch");
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        
    }

    public Branch findBranch(String name){
        int sizeOfArray = this.branches.size();
        for(int i = 0; i < sizeOfArray; i++){
            if(this.branches.get(i).getName().equals(name)) {
                return this.branches.get(i);
            }
            }
        return null;
        }
    }

