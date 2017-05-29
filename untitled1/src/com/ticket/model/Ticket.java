package com.ticket.model;

import java.util.Date;

/**
 * Created by Stefan on 5/27/2017.
 */
public class Ticket {
    int id;
    int price;
    int numberOfTickets;

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Ticket(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public Ticket() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
