/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.mysql.jdbc.Messages.getString;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Riya
 */
public class phn extends HttpServlet {

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
            out.println("<title>Servlet phn</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet phn at " + request.getContextPath() + "</h1>");
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
        PrintWriter out =response.getWriter();
        try{
            String state = request.getParameter("state");
            String dis = request.getParameter("District");
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/majorproject","root","1234");
            String query="insert into rent_app(ar_state,ar_district) values(?,?)";
            PreparedStatement st = cn.prepareStatement(query);
            st.setString(1,state);
            st.setString(2, dis);
            int re =st.executeUpdate();
            if(re>0)
            {
                if(request.getParameter("new_app").equals("Residence"))
                        {
                            response.sendRedirect("resi.jsp");
                        }
                else if(request.getParameter("new_app").equals("Non-Residence"))
                {
                    response.sendRedirect("non-res.html");
                }
            }
     
            
        }
        catch(Exception e)
        {
            out.println("error"+e);
        }

        
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
        String phn=request.getParameter("name");
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/majorproject","root","1234");
        Statement st=cn.createStatement();
        String query="Select name,phn,ar_add,ar_state,ar_pin,l_name,l_mail,exp_date from rent_app where phn='"+phn+"'";
        ResultSet rs=st.executeQuery(query);
        if(rs.next())
        {
            String n =rs.getString("name");
            String ars =rs.getString("ar_state");
            String ard =rs.getString("ar_add");
            String arp =rs.getString("ar_pin");
            String ln =rs.getString("l_name");
            String lm =rs.getString("l_mail");
            String ed =rs.getString("exp_date");
            request.setAttribute("n",n);
            request.setAttribute("ars",ars);
            request.setAttribute("ard",ard);
            request.setAttribute("arp",arp);
            request.setAttribute("ln",ln);
            request.setAttribute("lm",lm);
            request.setAttribute("ed",ed);
           request.setAttribute("phn",phn);
           RequestDispatcher rd = request.getRequestDispatcher("/renewal_application.jsp");
           rd.forward(request, response);
                  response.sendRedirect("renewal_application.jsp");
        }
        else{
            out.println("error");
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
