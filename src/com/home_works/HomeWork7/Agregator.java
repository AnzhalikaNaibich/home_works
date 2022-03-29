package com.home_works.HomeWork7;

import java.util.Collections;
import java.util.List;

public class Agregator {
    private List<Customer> customer;

    public Agregator() {
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }


    public void printAllCustomer() {
        Collections.sort(customer);
        for (int i = 0; i < customer.size(); i++) {
            System.out.println(customer.get(i).getLastName() + " " + customer.get(i).getFirstName() + " " + customer.get(i).getFatherName());
        }
    }

    public void printAllCustomerByNumberCreditCard() {
        int min = 300000000;
        int max = 1000000000;

        for (int i = 0; i < customer.size(); i++) {
            if (customer.get(i).getNumberCreditCard() > min && customer.get(i).getNumberCreditCard() < max)
                System.out.println(customer.get(i).getLastName() + " " + customer.get(i).getFirstName() + " " + customer.get(i).getNumberCreditCard() + " ");
        }
    }
}
