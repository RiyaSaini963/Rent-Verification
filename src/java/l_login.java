/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Riya
 */
@WebServlet(urlPatterns = {"/l_login"})
public class l_login extends HttpServlet {

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
            out.println("<title>Servlet l_login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet l_login at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        PrintWriter out =response.getWriter();
         try
        {
        String id=request.getParameter("id");
        String phn=request.getParameter("phn");
         Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/majorproject","root","1234");
        Statement st=cn.createStatement();
      String query="select * from rent_app where app_id='"+id+"' and l_mail='"+phn+"'";
      ResultSet rs=st.executeQuery(query);
      if(rs.next())
      {
        String quer="Select name,phn,occupation,dob,status,police_verification from rent_app where l_mail='"+phn+"'and app_id='"+id+"'";
        ResultSet sr=st.executeQuery(quer);
        if(sr.next())
        {
            String n = sr.getString("name");
            String ph= sr.getString("phn");
            String occ= sr.getString("occupation");
            String dob= sr.getString("dob");
            String  is = sr.getString("status");
            String pv= sr.getString("police_verification");
            request.setAttribute("n",n);
            request.setAttribute("ph",ph);
            request.setAttribute("occ",occ);
            request.setAttribute("dob",dob);
            request.setAttribute("is",is);
            request.setAttribute("pv",pv);
            request.setAttribute("id",id);
            RequestDispatcher rd = request.getRequestDispatcher("/tenant_details.jsp");
           rd.forward(request, response);
           response.sendRedirect("tenant_details.jsp");
           }
        else
        {
            out.println("ertr");
        }

 
      }
       

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
