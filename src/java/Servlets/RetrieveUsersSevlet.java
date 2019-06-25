/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import data.UserDAO;
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
public class RetrieveUsersSevlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        ArrayList list = new ArrayList();
        HttpSession session = request.getSession();

        switch (action) {
            case "all":
                try {
                    list = UserDAO.viewUsers();

                } catch (SQLException ex) {
                    Logger.getLogger(RetrieveUsersSevlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "approve":
                try {
                    list = UserDAO.unapprovedUsers("pending");
                } catch (SQLException ex) {
                    Logger.getLogger(RetrieveUsersSevlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "revoked":
                try {

                    list = UserDAO.unapprovedUsers("revoked");
                } catch (SQLException ex) {
                    Logger.getLogger(RetrieveUsersSevlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                break;
        }
        request.setAttribute("action", action);
        request.setAttribute("usr", list);
        RequestDispatcher disp = getServletContext().getRequestDispatcher("/ViewUsers.jsp");
        disp.forward(request, response);
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
