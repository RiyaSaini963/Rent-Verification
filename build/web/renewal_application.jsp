<%-- 
    Document   : renewal_application
    Created on : 10 Apr, 2019, 11:26:02 PM
    Author     : Riya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  font-family: Arial;
  font-size: 17px;
  padding: 8px;
}

* {
  box-sizing: border-box;
}

.row {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  margin: 0 -16px;
}

.col-25 {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
}

.col-50 {
  -ms-flex: 50%; /* IE10 */
  flex: 50%;
}

.col-75 {
  -ms-flex: 75%; /* IE10 */
  flex: 75%;
}

.col-25,
.col-50,
.col-75 {
  padding: 0 16px;
}

.bg{
    background-color: white;
    padding-left: 290px;
}
.container {
  background-color: #f2f2f2;
  border: 1px solid lightgrey;
  padding: 25px 12px 10px 5px;
  padding-left: 45px;
  border-radius: 3px;
  width: 70%;
  alignment-adjust: central;
}

input[type=text] {
  width: 88%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}
input[type=date]{
width: 88%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;    
}

label {
  margin-bottom: 10px;
  display: block;
}

.icon-container {
  margin-bottom: 20px;
  padding: 7px 0;
  font-size: 24px;
}

.btn {
  background-color: #4CAF50;
  color: white;
  padding: 12px;
  margin: 10px 0;
  border: none;
  width: 100%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 17px;
}

.btn:hover {
  background-color: #45a049;
}

a {
  color: #2196F3;
}

hr {
  border: 1px solid lightgrey;
}


span.price {
  float: right;
  color: grey;
}

/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
@media (max-width: 800px) {
  .row {
    flex-direction: column-reverse;
  }
  .col-25 {
    margin-bottom: 20px;
  }
}
</style>
</head>
<body>
       <div class="bg">
    <div class="container">
      <form>
      
        <div class="row">
          <div class="col-50">
            <h3>APPLICATION DETAILS</h3>
            
                <label for="fname"><i class="fa fa-user"></i> Tenant Name</label>
                <input type="text" id="fname" name="firstname" disabled="" value="${n}">
                
                <label for="adr"><i class="fa fa-phone"></i> Phone Number</label>
                <input type="text" id="adr" name="address" disabled="" value="${phn}">
            
                <label for="adr"><i class="fa fa-address-card-o"></i> Apartment Address</label>
                <input type="text" id="adr" name="address" disabled="" value="${ard}">
                
                <label for="city"><i class="fa fa-institution"></i> Apartment State</label>
                <input type="text" id="city" name="city" disabled="" value="${ars}">
                
                <label for="zip">Apartment Pin Code</label>
                <input type="text" id="zip" name="zip" disabled="" value="${arp}">
                    
                    <label for="zip">Agreement Expiry Date</label>
                    <input type="date" id="zip" name="date" disabled="" value="${ed}">
                
                
                  <label for="fname"><i class="fa fa-user"></i> Landlord Name</label>
                  <input type="text" id="fname" name="firstname" disabled="" value="${ln}">
                  
                  <label for="email"><i class="fa fa-envelope"></i> Landlord Email</label>
                  <input type="text" id="email" name="email" disabled="" value="${lm}">
            
             <div id="show">
                <label for="zip">Date Of Extension</label>
                    <input type="date" id="zip" name="edate">
                 </div>
                  <label>
          <input type="checkbox" checked="checked" name="sameadr" id="ch"> Same as previous rented space.
        </label>
        <input type="submit" value="Confirm Details" class="btn">
    </div>
  </div>
           
            
       </form>

</div>
</div>
</body>
</html>
