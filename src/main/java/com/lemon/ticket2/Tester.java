package com.lemon.ticket2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1.Taipei 2.Taichung 3.Kaohsiung)");
        Station start = null;
        int choice = Integer.parseInt(scanner.next());
        switch (choice){
            case 1:
                start = Station.TAIPEI;
                break;
            case 2:
                start = Station.TAICHUNG;
                break;
            case 3:
                start = Station.KAOHSIUNG;
                break;
        }
        System.out.println("Your end station?(1.Taipei 2.Taichung 3.Kaohsiung)");
        Station destination = null;
        choice= Integer.parseInt(scanner.next());

        switch (choice){
            case 1:
                destination = Station.TAIPEI;
                break;
            case 2:
                destination = Station.TAICHUNG;
                break;
            case 3:
                destination = Station.KAOHSIUNG;
                break;
        }
        System.out.println("Which kind of ticket? 1)Normal Ticket 2)Student Ticket 3)Elder Ticket 4)Return Tickets");
        choice = Integer.parseInt(scanner.next());
        Ticket ticket = null;
        switch (choice) {
            case 1:
                ticket = new Ticket(start, destination);
                System.out.print("NormalTicket");
                break;
            case 2:
                ticket = new StudentTicket(start, destination);
                System.out.print("StudentTicket");
                break;
            case 3:
                ticket = new ElderTicket(start, destination);
                System.out.print("ElderTicket");
                break;
            case 4:
                ticket = new ReturnTicket(start,destination);
                System.out.print("ReturnTicket");
        }
        ticket.print();
    }
}