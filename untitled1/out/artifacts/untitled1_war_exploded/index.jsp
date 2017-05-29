<%@ page import="com.ticket.model.Event" %>
<%@ page import="java.util.ArrayList" %><%--
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
  <body >
  <a>Hello and welcome to Ticket Mania</a>
  <a>Buy a ticket to our events</a>
  <form method="GET" action="registerServlet">

    <%--<c:forEach iteams="${toAdd}" var="current">--%>
      <%--<tr>--%>
        <%--<td>--%>
          <%--<c:out value="${current.getName()}"/>--%>
        <%--</td>--%>
      <%--</tr>--%>
    <%--</c:forEach>--%>

        <input type="submit" name="submit" value="Submit">

  </form>

  </body>
</html>
