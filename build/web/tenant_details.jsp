<%-- 
    Document   : tenant_details
    Created on : 5 May, 2019, 12:34:51 AM
    Author     : Riya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body, html {
  height: 100%;
  font-family: Arial, Helvetica, sans-serif;
  font-size: 30px;
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

.container {
  background-color: #f2f2f2;
  padding: 5px 20px 15px 20px;
  border: 1px solid lightgrey;
  border-radius: 3px;
}

input[type=text] {
  width: 100%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
  font-size: 30px;
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

<h2>Tenant Details</h2>
<div class="row">
  <div class="col-75">
    <div class="container">
        <form method="post" action="tdetails">
      
        <div class="row">
          <div class="col-50">
            <label for="fname"> Full Name</label>
            <input type="text" id="fname" name="name" disabled="" value="${n}">
            
            <label for="email"> Mobile Number</label>
            <input type="text" id="email" name="phn" disabled="" value="${ph}">
            
            <label for="adr"> Occupation</label>
            <input type="text" id="adr" name="occ" disabled="" value="${occ}">
            
            <label for="city"> Date Of Birth</label>
            <input type="text" id="city" name="dob" disabled="" value="${dob}">
            
            <label for="city">Identity Verification Status</label>
            <input type="text" id="city" name="iv" disabled="" value="${is}">

            <label for="city"> Police Verification Status</label>
            <input type="text" id="city" name="ip" disabled="" value="${pv}">
            
            <label for="city"> Rent amount</label>
            <input type="text" id="city" name="amt">
               

        </div>          
        </div>
        <label>
            <input type="checkbox" checked="checked" name="per">I hereby declare that I have checked all the details and 
            allow tenant to rent-out my apartment if details furnished by him/her found true.Any discrepancy found will 
            be reported. 
        </label>
        <input type="submit" value="Continue to checkout" class="btn">
        <input type="hidden" id="textbox" name="id" value="${id}">
        <input type="hidden" id="textbox" name="ph" value="${ph}">

      </form>
        
    </div>
  </div>
  
</div>

</body>
</html>
