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
@WebServlet(urlPatterns = {"/resi"})
public class resi extends HttpServlet {

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
            out.println("<title>Servlet resi</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet resi at " + request.getContextPath() + "</h1>");
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
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/majorproject","root","1234");
        Statement st=cn.createStatement();
        String ano=request.getParameter("aadhaar");
        String phn=request.getParameter("mob_no");
        Double phone;
            phone = Double.parseDouble(phn);
            
        String query="select name,phone,dob from uidai where a_number='"+ano+"'";
        ResultSet rs =st.executeQuery(query);
        if(rs.next())
        {
        String nam=rs.getString("name");
        String occ=request.getParameter("occupation");
        String ph =rs.getString("phone");
        String d=rs.getString("dob");
        
        String que="insert into rent_app(name,occupation,phn,dob) values(?,?,?,?)";
        PreparedStatement stmt =cn.prepareStatement(que);
        stmt.setString(1,nam);
        stmt.setString(2,occ);
        stmt.setString(3,ph);
        stmt.setString(4,d);
        int re=stmt.executeUpdate();
        if(re>0)
        {
            if(request.getParameter("name").equals(nam)&&request.getParameter("dob").equals(d)&&request.getParameter("mob_no").equals(ph))
            {    
             PreparedStatement ps=cn.prepareStatement("update rent_app set status='verified' where phn='"+phone+"'");
             ps.executeUpdate();
             
            }
            else
            {
             PreparedStatement ps=cn.prepareStatement("update rent_app set status='unverified' where phn='"+phone+"'");
             ps.executeUpdate();
             
            }
            
                }
        

        }
        
        String qy="select penality from fir where uidai_pass='"+ano+"'";
        ResultSet r =st.executeQuery(qy);
        if(r.next())
        {
        String penality=r.getString("penality");
        int penal=Integer.parseInt(penality);
        if(penal==406||penal==467||penal==468||penal==375||penal==376||penal==302||penal==471||penal==420)
        {
            PreparedStatement ps=cn.prepareStatement("update rent_app set police_verification='unverified' where phn='"+phone+"'");
            ps.executeUpdate();
        }
        else
        {
          PreparedStatement ps=cn.prepareStatement("update rent_app set police_verification='verified' where phn='"+phone+"'");
          ps.executeUpdate();  
        }
                
        }
        
        
        request.setAttribute("phn",phn);
        RequestDispatcher rd = request.getRequestDispatcher("/address.jsp");
        rd.forward(request,response);

        response.sendRedirect("address.jsp");
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
