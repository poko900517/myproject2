package com.lemon.ticket2;

public class StudentTicket extends Ticket {
        float off = 0.2f;
        public StudentTicket(Station start, Station destination) {
            super(start, destination);
            price = price - (int)(price*off);
        }
    }


