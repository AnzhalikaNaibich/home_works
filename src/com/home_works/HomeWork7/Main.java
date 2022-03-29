package com.home_works.HomeWork7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Ivanov", "Ivan", "Semenovich", "Ivanovskaya street, 1", 123456789, 987654321);
        Customer c2 = new Customer(2, "Petrov", "Petr", "Petrovich", "Petrovskaya street, 2", 108899667, 766998801);
        Customer c3 = new Customer(3, "Semenov", "Semen", "Semenovich", "Semenovskaya street, 3", 187654345, 543456781);
        Customer c4 = new Customer(4, "Ivanov", "Ivan", "Ivanovich", "Lenina street, 4", 287654345, 543456782);
        Customer c5 = new Customer(5, "Petrov", "Ivan", "Ivanovich", "Akademicheskaya street, 5", 387654343, 343456783);
        Customer c6 = new Customer(6, "Semenov", "Oleg", "Alekseevich", "Slavinskogo street, 6", 400654343, 343456004);
        Customer c7 = new Customer(7, "Eremin", "Pavel", "Aleksandrovich", "Pushkina street, 7", 511654343, 343456115);
        Customer c8 = new Customer(8, "Sokolov", "Nikolai", "Olegovich", "Minskaya street, 8", 911654555, 555456119);
        Customer c9 = new Customer(9, "Frolov", "Fedor", "Ivanovich", "Zavodskaya street, 9", 111654555, 555456111);

        List<Customer> customer = new ArrayList<>();
        customer.add(c1);
        customer.add(c2);
        customer.add(c3);
        customer.add(c4);
        customer.add(c5);
        customer.add(c6);
        customer.add(c7);
        customer.add(c8);
        customer.add(c9);

        Agregator agregator = new Agregator();
        agregator.setCustomer(customer);

        agregator.printAllCustomer();

        System.out.println("Список покупателей по номеру кредитной карты: ");
        agregator.printAllCustomerByNumberCreditCard();
    }

}
