package com.home_works.HomeWork7;

import java.util.ArrayList;
import java.util.List;

public class Agregator {
    private List<Customer> customer;

    public Agregator() {}

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }


    public void printAllCustomer (){
        for (int i = 0; i < customer.size(); i++) {
            System.out.println(customer.get(i).getLastName() + " " + customer.get(i).getFirstName() + " " + customer.get(i).getFatherName());
        }
    }

    public void printAllCustomerByNumberCreditCard () {
        int value1 = 100000000;
        int value2 = 200000000;
        int value3 = 300000000;
        int value4 = 400000000;
        int value5 = 500000000;
        int value6 = 600000000;
        int value7 = 700000000;
        int value8 = 800000000;
        int value9 = 900000000;
        int value10 = 1000000000;
        for (int i = 0; i < customer.size(); i++) {
            if (customer.get(i).getNumberCreditCard() > value3 && customer.get(i).getNumberCreditCard() < value10)
        System.out.println(customer.get(i).getLastName() + " " + customer.get(i).getFirstName() + " " + customer.get(i).getNumberCreditCard() + " ");
    }
   }
}
