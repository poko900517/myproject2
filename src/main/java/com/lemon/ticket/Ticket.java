package com.lemon.ticket;

public class Ticket {
    //public static final是使變數固定值不能被改變
   /*public static final int TAIPEI_CITY=100;
    //public static  int TAICHUNG_CITY=200;
    //public static  int KAOHSIUNG_CITY=400;*/

    int price;
    Station start;
    Station destination;

    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
        int diff = Math.abs(start.id - destination.id);
        //System.out.println(diff);
        switch (diff) {
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;

            case 300:
                price = 1100;
                break;

        }
        /*if(start == Station.TAIPEI) {
            if (destination == Station.TAICHUNG) {
                price = 500;
            } else {
                price = 1100;
            }
        } else if (start == Station.TAICHUNG) {
            if (destination == Station.KAOHSIUNG)
                price = 600;
        }else if (start == Station.KAOHSIUNG){
            if (destination == Station.TAICHUNG)
                price = 600;
        }
        }*/


        //public void print() {
            //TAIPEI_CITY
        }
    }
