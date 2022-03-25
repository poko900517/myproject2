package com.lemon.ticket;

public class Ticket {
    //public static final是使變數固定值不能被改變
    public static final int TAIPEI_CITY=100;
    public static  int TAICHUNG_CITY=200;
    public static  int KAOHSIUNG_CITY=300;

    int price;
    Station start;
    Station destination;
    public Ticket(Station start,Station destination){
        this.start= start;
        this.destination=destination;
    }

    public void print(){
        //TAIPEI_CITY
    }
    }
