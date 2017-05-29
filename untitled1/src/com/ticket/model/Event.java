package com.ticket.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Stefan on 5/27/2017.
 */
public class Event {
    int id;
    private Ticket eventTicket;
    List <Ticket> eventTicketList;
    String name;
    Date date;
    int nrOfTickets;
    int price;

    public Event(int id, String name, int nrOfTickets, int price) {
        this.id = id;
        this.name = name;
        this.nrOfTickets = nrOfTickets;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Ticket> getEventTicketList() {
        return eventTicketList;
    }

    public void setEventTicketList(List<Ticket> eventTicketList) {
        this.eventTicketList = eventTicketList;
    }

    public int getNrOfTickets() {
        return nrOfTickets;
    }

    public void setNrOfTickets(int nrOfTickets) {
        this.nrOfTickets = nrOfTickets;
    }

    public Event(int id, String name, int nrOfTickets) {
        this.id = id;
        this.name = name;
        this.nrOfTickets = nrOfTickets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Event(String name) {
        this.name = name;
    }

    public Ticket getEventTicket() {
        return eventTicket;
    }

    public void setEventTicket(Ticket eventTicket) {
        this.eventTicket = eventTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
