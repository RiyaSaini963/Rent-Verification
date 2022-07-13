<%-- 
    Document   : address
    Created on : 25 Apr, 2019, 5:12:26 AM
    Author     : Riya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Apartment and landlord </title>
        <link rel="stylesheet" type="text/css" href="style.css">
        <script> function fun()
            { var x= document.getElementById("DIV");
                if(x.style.display === "none")
                { x.style.display = "block";
                }
                else{ x.style.display ="none";
                }
            }
            
           </script>
    </head>
    <body>
        
        <h1 align="center"> APARTMENT AND LANDLORD </h1> <br><br><br><br>

        
        <form class="formstyle" method="post" action="add">
        <table align="center">
            <tr>
                <td> PERMANENT ADDRESS</td><td> <input type="text" name="add1"><p></td>
            
            <tr>
                <td>STATE</td><td> <input type="text" name="state"><p></td>
            </tr>
            <tr>
                <td>
                    PIN CODE </td><td> <input type="text" name="zip"><p></td>
            </tr>
            <tr>
                <td>
                    COUNTRY <td><select>
        <option>INDIA</option>
        <option>U.S.A</option>
                </td>
                    
            </select><p></p></tr>
            </table>
            <br>
            <center><font color="green"><b> PERMANENT ADDRESS SAME AS CURRENT ADDRESS </b><input type="radio" name="rad" onclick="fun()">YES 
             <input type="radio" name="rad">NO
             
             <div id="DIV">
                 <table align="center">
            <tr>
                <td> ADDRESS  </td><td> <input type="text" name="ca"><p></td>
                        
            <tr>
                <td>STATE</td><td> <input type="text" name="cs"><p></td>
            </tr>
            <tr>
                <td>
                    PIN CODE </td><td> <input type="text" name="cz"><p></td>
            </tr>
            <tr>
                <td>
                    COUNTRY <td><select>
        <option>INDIA</option>
        <option>U.S.A</option>
                </td>
                    
            </select><p></p></tr>
            </table>
             </div>
             <br>
        <button class="sub sub1" name="submit" value="SUBMIT">SUBMIT</button>
        <input type="hidden" id="textbox" name="phone" value="${phn}">
            </form>

    </body>
  
</html>