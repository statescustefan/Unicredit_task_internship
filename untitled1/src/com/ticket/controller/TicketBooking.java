package com.ticket.controller;

import com.ticket.model.Populate;
import com.ticket.model.Ticket;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stefan on 5/27/2017.
 */
@WebServlet(name = "Servlet", urlPatterns = {"/servlet"})
public class TicketBooking extends javax.servlet.http.HttpServlet {
    Populate populate=new Populate();
    List <Ticket>tickets=new ArrayList<>();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = new PrintWriter(response.getWriter());
        String event = request.getParameter("eventType");
       // out.print(event.toString());
        request.setAttribute("event",event);
        Ticket ticketDetails=populate.getTicketDetails(event);
        request.setAttribute("ticketDetails",ticketDetails);
      //  request.getRequestDispatcher("/login.jsp").forward(request, response);

    }
}
