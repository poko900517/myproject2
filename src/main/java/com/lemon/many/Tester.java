package com.lemon.many;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        System.out.println(list);
        int n1 = list.get(3);
        int n2 = list.get(1);
    }
}
