/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import data.DataRetrievalWrapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class showUsers extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ArrayList users = DataRetrievalWrapper.fetchUsers();
            request.setAttribute("usrs", users);
        } catch (SQLException ex) {
            Logger.getLogger(showUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestDispatcher disp = getServletContext().getRequestDispatcher("/ViewPosts.jsp");
        disp.forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
