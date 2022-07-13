<%-- 
    Document   : resi
    Created on : 24 Apr, 2019, 10:25:11 PM
    Author     : Riya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1 align="center"> RESIDENT APPLICATION FORM</h1>
        <hr>
        <h3 style="margin-left: 850px">PERSONAL DETAILS</h3>
        
         
        <form method="post" action="resi">
            <table align="center">
                <tr><td style="width: 250"> NAME</td><td><input type="text" name="name"></td></tr>
                <tr><td style="width: 250">GENDER</td><td><input type="radio" name="gender" value="male">MALE<input type="radio" value="female" name="gender">FEMALE</td></tr>
                <tr><td style="width: 250">DOB</td><td><input type="date" name="dob" placeholder="yyyy-mm-dd"></td></tr>
                <tr><td style="width: 250">MOBILE NUMBER</td><td><input type="text" name="mob_no" placeholder="10-digits" minlength="10" maxlength="10"></td></tr>
                <tr> <td style="width: 250">AADHAAR NUMBER</td><td><input type="text" name="aadhaar" placeholder="12-digits" minlength="12" maxlength="12"></td></tr>
                <tr><td style="width: 250">OCCUPATION</td><td><input type="text" name="occupation"></td></tr>
            </table>
            <br>
            <center><input class="sub sub1" type="submit" value="NEXT"></center>
          </form>

          
      

       
    </body>
</html>
