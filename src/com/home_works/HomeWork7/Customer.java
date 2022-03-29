package com.home_works.HomeWork7;

public class Customer implements Comparable<Customer> {
    private int id;
    private String lastName;
    private String firstName;
    private String fatherName;
    private String address;
    private int numberCreditCard;
    private int bankAccount;

    public Customer(int id, String lastName, String firstName, String fatherName, String address, int numberCreditCard, int bankAccount) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.address = address;
        this.numberCreditCard = numberCreditCard;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = address;
    }

    public int getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(int numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                ", numberCreditCard=" + numberCreditCard +
                ", bankAccount=" + bankAccount +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        int x = this.lastName.compareTo(o.lastName);
        if (x != 0) {
            return x;
        }
        x = this.firstName.compareTo(o.firstName);
        if (x != 0) {
            return x;
        }
        x = this.fatherName.compareTo(o.fatherName);
        return x;
    }
}
