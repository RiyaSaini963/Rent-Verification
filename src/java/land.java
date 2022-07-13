/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
@WebServlet(urlPatterns = {"/land"})
public class land extends HttpServlet {

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
            out.println("<title>Servlet land</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet land at " + request.getContextPath() + "</h1>");
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
        try{
        String phn=request.getParameter("phone");
        //Double ph=Double.parseDouble(request.getParameter("phone")); 
        String add=request.getParameter("add");
        String pin=request.getParameter("pin");
        String name=request.getParameter("name");
        String mail=request.getParameter("email");
        //int ph=Integer.parseInt(request.getParameter(phone));
        out.println(add);
        out.println(pin);
        out.println(name);
        out.println(mail);
        Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/majorproject","root","1234");
            String query="update rent_app set ar_add='"+add+"',ar_pin='"+pin+"',l_name='"+name+"',l_mail='"+mail+"' where phn='"+phn+"'";
            PreparedStatement st = cn.prepareStatement(query);
            int re =st.executeUpdate();
            if(re>0)
                
            {
                Statement sta=cn.createStatement();
                String quer="select app_id from rent_app where phn='"+phn+"'";
        ResultSet rs =sta.executeQuery(quer);
        if(rs.next())
        {
        String id=rs.getString("app_id");
        request.setAttribute("id",id);
                 RequestDispatcher rd = request.getRequestDispatcher("/after_form.jsp");
           rd.forward(request, response);

        }
                response.sendRedirect("after_form.jsp");}
            


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
