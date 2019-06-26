/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import data.DataRetrievalWrapper;
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

/**
 *
 * @author justus
 */
public class RegisterUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String regtype = request.getParameter("regtype");
        PrintWriter out = response.getWriter();
        switch (regtype) {
            case "type":
                String userType = (String) request.getParameter("usrtype");
                if (userType.equals("public")) {
                    RequestDispatcher disp = getServletContext().getRequestDispatcher("/PublicPersonalInformation.jsp");
                    disp.forward(request, response);
                } else {
                    ArrayList list;
                    try {
                        list = DataRetrievalWrapper.getOrgs();
                        request.setAttribute("list", list);
                    } catch (SQLException ex) {
                        Logger.getLogger(RegisterUserServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    RequestDispatcher disp = getServletContext().getRequestDispatcher("/ProfPersonalInformation.jsp");
                    disp.forward(request, response);
                }
                break;

            case "personal": {
                try {
                    savePersonalInfo(request, response);

                } catch (SQLException ex) {
                    Logger.getLogger(RegisterUserServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                out.print(" <script type='text/javascript' src='resources/vendor/jquery/jquery.min.js'></script>");
                out.print(" <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js'></script>\n");
                out.print(" <script type='text/javascript' src='resources/js/AlertSuccess.js'></script>");
                RequestDispatcher disp = getServletContext().getRequestDispatcher("/Login.jsp");
                disp.include(request, response);
                break;
            }
            case "prof": {
                try {
                    saveProf(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(RegisterUserServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                out.print(" <script type='text/javascript' src='resources/vendor/jquery/jquery.min.js'></script>");
                out.print(" <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js'></script>\n");
                out.print(" <script type='text/javascript' src='resources/js/AlertSuccess.js'></script>");
                RequestDispatcher disp = getServletContext().getRequestDispatcher("/Login.jsp");
                disp.include(request, response);
                break;
            }

        }
    }

    public void savePersonalInfo(HttpServletRequest request, HttpServletResponse response) throws SQLException {

        String fname = request.getParameter("fname");

        String sname = request.getParameter("sname");

        String id = request.getParameter("id");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        String password = request.getParameter("password");
        UserDAO.saveUser(fname, sname, id, password, email, phone);
    }

    public void saveProf(HttpServletRequest request, HttpServletResponse response) throws SQLException {

        String fname = request.getParameter("fname");
        String sname = request.getParameter("sname");
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        String org = request.getParameter("org");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        UserDAO.saveProf(email, id, fname, sname, phone, password, org);

    }

    //get the first two characters of the string
    public static String first2(String str) {
        return str.length() < 1 ? str : str.substring(0, 1);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
