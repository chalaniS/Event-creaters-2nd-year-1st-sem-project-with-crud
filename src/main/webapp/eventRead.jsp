<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Event</title>
    <link rel="stylesheet" href="css/readEvent.css" />
    <link rel="stylesheet" href="css/createEvent.css" />
  </head>
  <body>
    <h1 class="hname">Scheduled Events</h1>
    <table id="etable">
      <tr>
      	<th>Event Id</th>
        <th>Event Name</th>
        <th>Event Date</th>
        <th>Event Type</th>
        <th>Event Location</th>
        <th>Event Time</th>
      </tr>
       <c:forEach var="eve" items = "${eveDetails}">
      	 <tr>
      	 	<td>${eve.eid}</td>
        	<td>${eve.ename}</td>
            <td>${eve.edate}</td>
            <td>${eve.etype}</td>
            <td>${eve.elocation}</td>            
            <td>${eve.etime}</td>
            
      	</tr>                
       </c:forEach>
           
    </table>
  </body>
</html>
    