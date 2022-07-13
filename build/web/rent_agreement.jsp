<%-- 
    Document   : rent_agreement
    Created on : 5 May, 2019, 11:05:24 PM
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
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.bg-image {
  /* Full height */
  height: 50%; 
  
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}

/* Images used */
.img1 { background-image: url("img/v1.jpg"); }
.img2 { background-image: url("img/v3.jpg"); }
.img3 { background-image: url("img/v2.jpg"); }
.img4 { background-image: url("img/v4.jpg"); }
.img5 { background-image: url("img/v6.jpg"); }
.img6 { background-image: url("img/v5.jpg"); }

/* Position text in the middle of the page/image */
.bg-text {
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
  color: white;
  font-weight: bold;
  font-size: 80px;
  border: 10px solid #f1f1f1;
  position: fixed;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 2;
  width: 80%;
  padding: 20px;
  text-align: center;
}
.bitt {
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
  color: white;
  font-weight: bold;
  font-size: 80px;
  border: 10px solid #f1f1f1;
  position: fixed;
  transform: translate(-50%, -50%);
  top: 80%;
  left: 48%;
  z-index: 2;
  width: 350px;
  padding: 20px;
  text-align: center;
}
input[type=submit]
{
    width: 300px;
    height: 100px;
    font-size: 30px;
}
</style>
</head>
<body>

<div class="bg-image img1"></div>
<div class="bg-image img2"></div>
<div class="bg-image img3"></div>
<div class="bg-image img4"></div>
<div class="bg-image img5"></div>
<div class="bg-image img6"></div>

<div class="bg-text">Congratulations!!Your application have been selected.</div><br>
<div class="bitt"><a href="home2.html"><input type="submit" value="Logout"></a></div>
</body>
</html>
