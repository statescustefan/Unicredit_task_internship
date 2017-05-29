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
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html>
  <head>
    <title>Ticket Mania</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
  <%
      List<Event> toAdd=new ArrayList<>();
      // retrieve your list from the request, with casting
      toAdd = (ArrayList<Event>) request.getAttribute("toAdd");

// print the information about every category of the list
      for(Event event : toAdd) {
         // out.println(event.getName());
      }
      %>
  <form action="servlet" method="get">
  <select name="eventType">
      <c:forEach items="${toAdd}" var="current">
        <option>
                <c:out value="${current.getName()}"/>
        </option>
      </c:forEach>
  </select>
      <input type="submit" name="submit" value="Submit">
  </form>
  </body>
</html>
