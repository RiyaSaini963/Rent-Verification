/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author Riya
 */
@WebServlet(urlPatterns = {"/add"})
public class add extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet add</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet add at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try
        {String phn =request.getParameter("phone");
          // Double phone = Double.parseDouble(phn);
           
             
           String padd=request.getParameter("add1");
           String ps=request.getParameter("state");
           String pcode =request.getParameter("zip");
           String ca=request.getParameter("ca");
           String cs=request.getParameter("cs");
           String cp=request.getParameter("cz");
           
           
         Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/majorproject","root","1234");
        PreparedStatement pas=cn.prepareStatement("update rent_app set pre_address='"+padd+"',pre_state='"+ps+"',pre_pin="+pcode+",curr_add='"+ca+"',curr_state='"+cs+"',curr_pin="+cp+" where phn='"+phn+"'");
        //int re=
                pas.executeUpdate();
                request.setAttribute("phn",phn);
        RequestDispatcher rd = request.getRequestDispatcher("/land.jsp");
        rd.forward(request,response);
        
        
       
        //response.sendRedirect("land.jsp");*/
       
         
        }
        catch(Exception e)
        {
         out.println("error"+e);   
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
