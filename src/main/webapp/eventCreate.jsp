<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="css/createEvent.css" />
  
  </head>
  <body>    
    
    <!-- create event form -->
   
    <div id="cont">
     <h1 class="hname">Create Event</h1>
      <form method="post" action="event">
      
        <label for="ename">Event Name :</label>
        <input type="text" class="ename" name="ename" id="inp" /><br /><br />

        <label for="ename">Event Date :</label>
        <input type="date" class="edate" name="edate" id="inp" /><br /><br />
        
        <label for="etype">Select Event Type  </label><br0><br>
       
        <label for="etype" class="rtype">Outdoor Event :</label>        
        <input type="radio"  name="etype" value="outdoor"/>
        
        <label for="etype" class="rtype" >Indoor Event  :</label>
        <input type="radio" name="etype" value="indoor" />
        <br /><br />

        <label for="elocation">Event Location :</label>
        <input type="text" class="elocation" name="elocation" id="inp" /><br /><br />

        <label for="time">Choose time :</label>
        <select name="etime" id="inp"  >
          <option value="morning">Morning</option>
          <option value="evening">Evening</option>
          <option value="night">Night</option>
        </select>

        <br /><br />

        <button type="submit" id="subBtn">Submit</button>
        <button type="reset" id="resetBtn">Reset</button>

        <br /><br />
      </form>
    </div>
    <br><br>
    
    <!-- read data form -->  
    <div id="cont">
      <h1 class="hname">Read Event</h1>
      <form action="readevent" method="post">
        <label for="etype">Select Event Type </label><br /><br />
        
        <label for="etype" class="rtype">Outdoor Event :</label>
        <input type="radio" name="etype" value="outdoor" />

        <label for="etype" class="rtype">Indoor Event :</label>
        <input type="radio" name="etype" value="indoor" /><br /><br />
        <button type="submit" class="subBtn">View History</button>
        <br /><br />
      </form>
    </div>
    
     
    <!-- delete data form -->
    <div id="cont">
      <h1 class="hname">Delete Event</h1>
      <form action="deleteevent" method="post">
        <label for="eid" class="eid">Enter Event Id : </label>
        <input type="number" name="eid" value="outdoor" />
        <br /><br />
        <button type="submit" class="subBtn">Delete Event</button>
        <br /><br />
      </form>
    </div>
  </body>
</html>
