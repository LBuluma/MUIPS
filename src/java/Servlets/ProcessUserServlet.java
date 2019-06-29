/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import data.UserDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author justus
 */
public class ProcessUserServlet extends HttpServlet {

   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String action = request.getParameter("action");
     String email = request.getParameter("email");
     String url = null;
     if(action.equals("approve")){
         try {
             UserDAO.changeUserStatus(email, "approved");
             url ="/RetrieveUsers?action=approve";
         } catch (SQLException ex) {
             Logger.getLogger(ProcessUserServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
     }else if(action.equals("revoke")){
         try {
             UserDAO.changeUserStatus(email, "revoked");
             url ="/RetrieveUsers?action=revoked";
         } catch (SQLException ex) {
             Logger.getLogger(ProcessUserServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
     disp.forward(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
