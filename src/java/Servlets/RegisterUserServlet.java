/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import data.DataInsertionWrapper;
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
        String regtype = request.getParameter("regtype");
        PrintWriter out = response.getWriter();
        switch (regtype) {
            case "type":
                String userType = (String) request.getParameter("usrtype");
                if (userType.equals("public")) {
                    RequestDispatcher disp = getServletContext().getRequestDispatcher("/PublicPersonalInformation.jsp");
                    disp.forward(request, response);
                } else {
                    RequestDispatcher disp = getServletContext().getRequestDispatcher("/ProfPersonalInformation.jsp");
                    disp.forward(request, response);
                }
                break;
            case "personal": {
                savePersonalInfo(request, response);
                RequestDispatcher disp = getServletContext().getRequestDispatcher("/PublicContactInformation.jsp");
                disp.forward(request, response);
                break;
            }
            case "contact": {
                try {
                    saveUser(request, response);

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

    public void savePersonalInfo(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        String fname = request.getParameter("fname");
        session.setAttribute("fname", fname);
        String sname = request.getParameter("sname");
        session.setAttribute("sname", sname);
        String id = request.getParameter("id");
        session.setAttribute("id", id);
        String password = request.getParameter("password");
        session.setAttribute("password", password);

    }

    private void saveUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        HttpSession session = request.getSession();
        String fname = (String) session.getAttribute("fname");
        String sname = (String) session.getAttribute("sname");
        String id = (String) session.getAttribute("id");
        String pass = (String) session.getAttribute("password");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String county = request.getParameter("county");
        String constituency = request.getParameter("constituency");
        String ward = request.getParameter("ward");
        String village = request.getParameter("village");
        System.out.println(ward);
        String locationId = id + first2(county);

        DataInsertionWrapper.addLocation(locationId, address, county, constituency, ward, village);
        UserDAO.saveUser(fname, sname, id, pass, email, phone, locationId);
    }

    public void saveProf(HttpServletRequest request, HttpServletResponse response) throws SQLException {

        String fname = request.getParameter("fname");
        String sname = request.getParameter("sname");
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String org = request.getParameter("org");
        String orgEmail = request.getParameter("orgEmail");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        UserDAO.saveProf(email, id, fname, sname, phone, password, org, orgEmail);

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
