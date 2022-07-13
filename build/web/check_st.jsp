<%-- 
    Document   : check_st
    Created on : 6 May, 2019, 8:20:02 AM
    Author     : Riya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
  height: 100%;
  font-family: Arial, Helvetica, sans-serif;
  font-size: 30px;
}

* {
  box-sizing: border-box;
}

.bg-img {
  /* The image used */
  background-image: url("img/v3.jpg");
  min-height: 100%;
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

/* Add styles to the form container */
.container {
  position: absolute;
  right: 0;
  margin: 20px;
  max-width: 1200px;
  padding: 16px;
  background-color: white;
  margin-right: 60px;
  margin-top: 50px;
  height: 60%;
  
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  height: 59px;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit button */
.btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
  font-size: 40px;
}

.btn:hover {
  opacity: 1;
}
</style>
</head>
<body>

<div class="bg-img">
  <form method="post" action="st_check" class="container">
    <h1>Landlord Login</h1>

    <label for="email"><b>Application Id</b></label>
    <input type="text" placeholder="Enter Application Id" name="id" required>

    
    <button type="submit" class="btn">Login</button>
  </form>
</div>
</body>
</html>
