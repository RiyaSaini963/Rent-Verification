<%-- 
    Document   : land
    Created on : 25 Apr, 2019, 1:58:04 AM
    Author     : Riya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Apartment and landlord </title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h1 align="center"> RESIDENT APPLICATION FORM</h1>
        <hr>
        
        <form method="post" action="land">
            <table align="center">
                <tr><td style="width: 250"> APARTMENT ADDRESS</td><td><input type="text" name="add"></td></tr>
                <tr><td style="width: 250">PIN</td><td><input type="text" name="pin"></td></tr>
                <tr><td style="width: 250">Landlord NAME</td><td><input type="text" name="name"></td></tr>
                <tr> <td style="width: 250">E-MAIL ADDRESS</td><td><input type="text" name="email"></td></tr>
             </table> 
            <br>
            <center><input class="sub sub1" type="submit" value="NEXT"></center>
            <input type="hidden" id="textbox" name="phone" value="${phn}">
            
        </form>
        
         </body>  
</html>