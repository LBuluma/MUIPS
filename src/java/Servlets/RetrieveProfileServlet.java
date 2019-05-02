/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import data.DataRetrievalWrapper;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author justus
 */
public class RetrieveProfileServlet extends HttpServlet {

    
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            ArrayList list;
            HttpSession session = request.getSession();
            String role = (String) session.getAttribute("role");
            String email = (String) session.getAttribute("email");
        try {
           list = DataRetrievalWrapper.getProfile(email);
           System.out.print(list);
           request.setAttribute("list", list);
        } catch (SQLException ex) {
            Logger.getLogger(RetrieveProfileServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            String url = null;
            
            switch (role) {
                case "admin":
                    session.setAttribute("role", role);
                    session.setAttribute("email", email);
                    url = "/AdminProfile.jsp";
                    break;
                case "officer":
                    session.setAttribute("role", role);
                    session.setAttribute("email", email);
                    url = "/OfficerProfile.jsp";
                    break;
                case "agent":
                    session.setAttribute("role", role);
                    session.setAttribute("email", email);
                    url = "/AgentProfile.jsp";
                    break;
                case "publicuser":
                    session.setAttribute("role", role);
                    session.setAttribute("email", email);
                    url = "/PublicUserProfile.jsp";
                    break;
            }
          RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
        disp.forward(request, response);
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
