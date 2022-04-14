package com.lemon.ticket2;

public class ElderTicket extends Ticket {
    float off = 0.5f;

    public ElderTicket(Station station, Station destination) {
        super(station, destination);
        price = price - (int) (price * off);
    }
}
