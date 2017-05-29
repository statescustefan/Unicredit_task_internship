package com.ticket.controller;

import com.ticket.model.Event;
import com.ticket.model.Populate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Stefan on 5/27/2017.
 */
@WebServlet(name = "RegisterServlet",urlPatterns = {"/registerServlet"})
public class RegisterServlet extends HttpServlet {
    static List<Event> eventList=new ArrayList<>();
    private void getEventList(){

    }
    private PrintWriter writer =null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       writer=response.getWriter();
        Populate populate=new Populate();
        String name = request.getParameter("name");
        String mail = request.getParameter("mail");
        PrintWriter out = new PrintWriter(response.getWriter());
        String message="";
        eventList=populate.populateEventList();
        List<Event> toAdd=new ArrayList<>();
        toAdd.addAll(eventList);
        request.setAttribute("toAdd",eventList);
        try {
            Iterator<Event> itr =  toAdd.iterator();
            while(itr.hasNext()) {
                out.println(itr.next().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println(message);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
}
