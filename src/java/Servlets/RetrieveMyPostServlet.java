/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Case.Description;
import Case.MissingPerson;
import Case.Transportation;
import Case.UnidentifiedPerson;
import data.CaseDAO;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author justus
 */
public class RetrieveMyPostServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
      String role = (String) session.getAttribute("role");
      String email =  (String) session.getAttribute("email");
       String url = null;
        try {
            ArrayList  list = CaseDAO.retrieveMyPosts(email, role);
            request.setAttribute("list", list);
        } catch (SQLException ex) {
            Logger.getLogger(RetrieveMyPostServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(role.equals("publicuser")){
            url = "/ViewMyPosts.jsp"; 
        }else if(role.equals("prof")){
            url = "/ProfVIewMyPosts.jsp"; 
        }
      
      RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
        disp.forward(request, response);
    }
    }
    


