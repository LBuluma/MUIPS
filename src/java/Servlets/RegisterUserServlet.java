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
import javax.servlet.http.HttpSession;

/**
 *
 * @author justus
 */
public class RegisterUserServlet extends HttpServlet {

    String url;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
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
                        session.setAttribute("list", list);
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

            }
            break;
            case "prof": {
                try {
                    saveProf(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(RegisterUserServlet.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            }

        }
    }

    public void savePersonalInfo(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {

        String id = request.getParameter("id");
         String email = request.getParameter("email");
         boolean z = UserDAO.verifyEmail(email);
        boolean x = UserDAO.verifyId(id);
        boolean y = UserDAO.verifyExisting(id, "publicuser");
        PrintWriter out = response.getWriter();
        if (x == true && y == false && z == false) {
            String fname = request.getParameter("fname");

            String sname = request.getParameter("sname");

           
            String phone = request.getParameter("phone");

            String password = request.getParameter("password");
            UserDAO.saveUser(fname, sname, id, password, email, phone);
            out.print(" <script type='text/javascript' src='resources/vendor/jquery/jquery.min.js'></script>");
            out.print(" <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js'></script>\n");
            out.print(" <script type='text/javascript' src='resources/js/AlertSuccess.js'></script>");

            url = "/Login.jsp";

        } else if(x == false) {
            request.setAttribute("usrMsg", "Invalid ID number");
            url = "/PublicPersonalInformation.jsp";

         }else if(x == true  &&  y == true){
            request.setAttribute("usrMsg", "User already exists");
            url = "/ProfPersonalInformation.jsp";
        }else if(x == true && z == true){
            request.setAttribute("usrMsg", "Email already in use");
            url = "/ProfPersonalInformation.jsp";
        }
        RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
        disp.include(request, response);
    }

    public void saveProf(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String id = request.getParameter("id");
         String email = request.getParameter("email");
        boolean z = UserDAO.verifyEmail(email);
        boolean x = UserDAO.verifyProfId(id);
        boolean y = UserDAO.verifyExisting(id,"prof");
        PrintWriter out = response.getWriter();
        if (x == true && y == false && z == false) {
            String fname = request.getParameter("fname");
            String sname = request.getParameter("sname");

            String password = request.getParameter("password");

            String org = request.getParameter("org");
           
            String phone = request.getParameter("phone");
            UserDAO.saveProf(email, id, fname, sname, phone, password, org);
            out.print(" <script type='text/javascript' src='resources/vendor/jquery/jquery.min.js'></script>");
            out.print(" <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js'></script>\n");
            out.print(" <script type='text/javascript' src='resources/js/AlertSuccess.js'></script>");
            url = "/Login.jsp";
        } else if(x == false ) {
            request.setAttribute("usrMsg", "Invalid user ID");
            url = "/ProfPersonalInformation.jsp";

        }else if(x == true  &&  y == true){
            request.setAttribute("usrMsg", "User already exists");
            url = "/ProfPersonalInformation.jsp";
        }else if( x == true && z == true){
           request.setAttribute("usrMsg", "Email already in use");
            url = "/ProfPersonalInformation.jsp"; 
        } 
        RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
        disp.include(request, response);

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
