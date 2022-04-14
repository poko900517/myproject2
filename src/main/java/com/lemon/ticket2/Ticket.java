package com.lemon.ticket2;

import java.util.Scanner;

public class Ticket {
    //public static final是使變數固定值不能被改變
    public static final int TAIPEI_CITY=100;
    public static  int TAICHUNG_CITY=200;
    public static  int KAOHSIUNG_CITY=300;

    int price;
    int number;
    Station start;
    Station destination;
    Ticket ticket;
    public Ticket(Station start, Station destination){
        Scanner scanner = new Scanner(System.in);
        this.start= start;
        this.destination=destination;

        if (start == Station.TAIPEI) {
            if (destination == Station.TAICHUNG) {
                price = 600;
            } else {
                price = 1500;
            }
        } else if (start == Station.TAICHUNG) {
            if (destination == Station.TAIPEI) {
                price = 600;
            } else {
                price = 900;
            }
        } else if (start == Station.KAOHSIUNG) {
            if (destination == Station.TAICHUNG) {
                price = 900;
            } else {
                price = 1500;
            }
        }
        System.out.println("How many numbers want to buy?");
        number = Integer.parseInt(scanner.next());
    }
    public void print() {
        System.out.println("\t" +start.name + "\t" + destination.name + "\t" + number +"\t"+ price*number);
    }
}