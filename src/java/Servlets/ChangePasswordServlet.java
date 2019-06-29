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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author denis
 */
public class ChangePasswordServlet extends HttpServlet {

    protected void doGET(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("email");
            int status;
            String oldpwd = request.getParameter("oldPass");

            String newpswd = request.getParameter("newPass");

            String confpswd = request.getParameter("confPass");
            String path = "/ChangePassword.jsp";
            PrintWriter out = response.getWriter();

            status = UserDAO.changePass(username, newpswd, oldpwd);
            System.out.println(status);
            if (!newpswd.equals(confpswd)) {
               
                request.setAttribute("errpass", "New password and confirm password do not match.");
                getServletContext().getRequestDispatcher(path).include(request, response);
            } else if (status == 0) {
               
                request.setAttribute("errpass", "Incorrect old password.");
                getServletContext().getRequestDispatcher(path).include(request, response);
            } else if (newpswd.equals(confpswd) && (status != 0)) {
                
                request.setAttribute("errpass", "Password Successfully Changed");
                getServletContext().getRequestDispatcher(path).include(request, response);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ChangePasswordServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
