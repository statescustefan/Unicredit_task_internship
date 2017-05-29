package com.ticket.model;

import javafx.collections.transformation.TransformationList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stefan on 5/27/2017.
 */
public class Populate {
    public static List<Event> eventList = new ArrayList<>();
    public static List<Ticket> ticketList = new ArrayList<>();

    public List<Event> populateEventList(){

        Event event1=new Event(100,"Untold Festival",100,200);
        Event event2=new Event(101,"AfterHill Festival",50,347);
        Event event3=new Event(102,"NeverBefore Festival",34,232);
        Event event4=new Event(103,"Sea Dance Festival",120,234);
        Event event5=new Event(104,"By the Sea Festival",100,232);
        eventList.add(event1);
        populateTicketListEvent(event1);
        eventList.add(event2);
        populateTicketListEvent(event1);
        eventList.add(event3);
        populateTicketListEvent(event1);
        eventList.add(event4);
        populateTicketListEvent(event1);
        eventList.add(event5);

        return eventList;
    }

    public Ticket populateEventTicket(String eventName){
        Ticket t=new Ticket();
        for (Event event : eventList) {
            if (event.getName() == event.getName()) {
                t.setId(event.getId());
                t.setPrice(event.getPrice());
                t.setNumberOfTickets(event.getNrOfTickets());
                break;
            }
        }
        return t;
    }
    public Event populateTicketListEvent(Event E){
        for (Event event : eventList) {
            if (event.getName() == event.getName()) {
                for (int i = 0; i < event.getNrOfTickets(); i++) {
                  //  event.setEventTicket(new Ticket(i,i));
                    ticketList.add(new Ticket(i,399));
                }
            }
        }
        E.setEventTicketList(ticketList);
        return E;
    }

    public void setCancellation(String eventName, int TicketId) {
        for (Event event : eventList) {
            if (event.getName()== eventName)
            {
                for( Ticket ticket: ticketList){
                    if (ticket.getId()== TicketId){
                        ticketList.remove(TicketId);
                        event.getEventTicketList().remove(TicketId);
                    }
                }
            }
        }
    }

    public Ticket getTicketDetails(String eventName) {
        Ticket ticket=new Ticket();
        for (Event event : eventList) {
            if (event.getName() == eventName) {
                ticket=event.getEventTicket();
                break;
            }
        }
        return ticket;
    }
//    public int getReservationList(String eventName) {
//        Ticket ticket=new Ticket();
//        for (Event event : eventList) {
//            if (event.getName() == eventName) {
//                nr=event.getNrOfTickets();
//                break;
//            }
//        }
//        return nr;
//    }
    public void setReservation(String eventName, Ticket ticket) {
        for (Event event : eventList) {
            if (event.getName()== eventName)
            {
                event.setEventTicket(ticket);
                event.getEventTicketList().add(ticket);
            }
        }
    }

}