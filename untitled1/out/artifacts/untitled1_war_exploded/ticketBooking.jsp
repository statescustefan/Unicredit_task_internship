<%@ page import="com.ticket.model.Event" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Stefan
  Date: 5/27/2017
  Time: 7:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.*" %>
<%@ page import="com.ticket.model.Ticket" %>
<%@ page import="java.awt.image.AreaAveragingScaleFilter" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html>
  <head>
    <title>Ticket Mania</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
  <%
    String event = (String)request.getAttribute("event");

    Ticket ticketsDetails = (Ticket)request.getAttribute("ticketDetails");

    %>
  <a>${event}</a>
  <a>This is the list with all the tickets for the event you selected.</a>
  <a>${ticketsDetails}</a>
  </body>
</html>
