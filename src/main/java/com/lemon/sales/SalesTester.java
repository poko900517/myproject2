package com.lemon.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    //繼承java.lang.Object
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(800);
        list.add(2000);

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("001",1200));
        customers.add(new Customer("002",800));
        customers.add(new Customer("003",2000));
        customers.add(new Customer("006",500));
        customers.add(new Customer("007",900));
        for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }
        for(Customer c : customers){
            c.print();
        }
    }
}
