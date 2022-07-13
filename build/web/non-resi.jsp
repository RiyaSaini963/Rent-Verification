<%-- 
    Document   : non-resi.jsp
    Created on : 25 Apr, 2019, 9:25:12 AM
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
        <h1 align="center"><u>NON RESIDENT APPLICATION FORM</u></h1><p>
        <hr>
        <h3 style="margin-left: 820px">PERSONAL DETAILS</h3>
        <form method="post" action="check">
            <table align="center">
                <tr>
                <td>NAME </td><td></td><td><input type="text" name="name"><p></td>
            </tr>
             <tr>
                <td>NATIONALITY </td><td></td><td><input type="text" name="nationality"><p></td>
            </tr>
            <tr>
                <td>GENDER </td><td></td><td><input type="radio" name="rad">MALE  <input type="radio" name="rad">FEMALE<p></td>
            </tr>
            <tr>
                <td>D.O.B </td><td></td><td><input type="date" name="dob"><p></td>
            </tr>
            <tr>
                <td>PASSPORT NUMBER </td><td></td><td><input type="text" name="p_no" minlength="9" maxlength="9"><p></td>
            </tr>
            <tr>
                <td>DATE OF EXPIRY </td><td></td> <td> <input type="date" name="p_date"> </td><p>
                       
            </tr>
            <tr>
                <td>TYPE OF VISA </td><td></td><td> <input type="text" name="visa"><p>
            </tr>
            <tr>
                <td>ISSUE NUMBER </td><td></td><td><input type="text" name="issue_no" min="8" max="8"><p></td>
            </tr> 
               <tr>
                   <td>DATE OF EXPIRY </td><td></td><td> <input type="date" name="ex"> </td><p>
                       
            </tr>
               <tr><td> MOBILE NUMBER </td><td></td><td> <input type="tel" name="mob_no" minlength="10" maxlength="10" placeholder="10 digits"><p></td></tr>
            <tr>
                <td>OCCUPATION </td><td></td><td><input type="text" name="occupation"><p></td>
            </tr>
            </table>
            <hr>
                    <br>
            <center><input type="submit" value="NEXT"></center>
        </form>
    </body>
</html>
