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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import user.User;

/**
 *
 * @author justus
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = null;
        try {
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            User usr = UserDAO.validateUser(email, password);

            String role = usr.getUser_role();
            String org = usr.getUser_org();
            System.out.println(usr.getUser_fname());
            HttpSession session = request.getSession();
            //PrintWriter out = response.getWriter();

            if (null == role) {
                /* out.print(" <script type='text/javascript' src='resources/vendor/jquery/jquery.min.js'></script>");
                out.print(" <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js'></script>\n");
                out.print(" <script type='text/javascript' src='resources/js/AlertLoginFail.js'></script>");*/
                request.setAttribute("logmsg", "Invalid credentials");

                url = "/Login.jsp";
            } else if (role != null) {

                String user = usr.getUser_fname() + " " + usr.getUser_sname();

                switch (role) {

                    case "publicuser":
                        session.setAttribute("userName", user);
                        System.out.println(user);
                        session.setAttribute("role", "publicuser");
                        session.setAttribute("email", email);
                        session.setAttribute("org", org);
                        url = "/PublicDashBoard.jsp";
                        break;
                    case "prof":
                        if (usr.getUser_status().equals("approved")) {
                            session.setAttribute("myOrg", org);
                            session.setAttribute("userName", user);
                            session.setAttribute("role", "prof");
                            session.setAttribute("email", email);
                            url = "/ProfDashBoard.jsp";
                        } else {
                            url = "/Login.jsp";
                        }

                        break;
                    case "admin":
                        session.setAttribute("email", email);
                        session.setAttribute("userName", "Administrator");
                        session.setAttribute("role", "admin");
                        url = "/AdminDashBoard.jsp";
                        break;

                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
        disp.include(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
