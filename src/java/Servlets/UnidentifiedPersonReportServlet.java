/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import data.CaseDAO;
import data.DataInsertionWrapper;
import data.UnidentifiedPersonDAO;
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

public class UnidentifiedPersonReportServlet extends HttpServlet {

    String personId;
    String weight;
    String height;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = (String) request.getParameter("action");
        System.out.println(action);

        switch (action) {
            case "demo": {
                try {
                    serveDemo(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(UnidentifiedPersonReportServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "info":
                try {
                    serveInfo(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(MissingPersonReportServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case "distinct":
                try {
                    serveDist(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(MissingPersonReportServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "location":
                try {
                    serveLoc(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(MissingPersonReportServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                break;
        }
    }

    public void serveDemo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String fname;
        String sname;
        String language;
        String gender;
        String ethnic;
        String tribe;
        String url = null;

        HttpSession session = request.getSession();
        String ob = request.getParameter("ob");
        boolean x = CaseDAO.verifyOb(ob);
        boolean y = CaseDAO.verifyObExist(ob);
        if (x == true && y == false) {

            sname = (String) request.getParameter("sname");
            language = (String) request.getParameter("language");
            gender = (String) request.getParameter("gender");
            ethnic = (String) request.getParameter("ethnic");
            session.setAttribute("id", ob);
            weight = (String) request.getParameter("weight");
            height = (String) request.getParameter("height");
            String age = (String) request.getParameter("age");
            session.setAttribute("age", age);
            String dateFound = (String) request.getParameter("dateFound");
            fname = (String) request.getParameter("fname");
            session.setAttribute("weight", weight);
            session.setAttribute("height", height);
            personId = CaseDAO.generateId("unidentified");
            session.setAttribute("personId", personId);
            UnidentifiedPersonDAO.saveUnidentifiedPerson(fname.toUpperCase(), sname.toUpperCase(), personId, ethnic.toUpperCase(), gender.toUpperCase(),
                    dateFound, language.toUpperCase());

            url = "/UnidentifiedDescription.jsp";
        } else if (x == false) {
            request.setAttribute("oberr", "Case does not exist");
            url = "/UnidentifiedPersonDemograhics.jsp";
        }else if(y == true){
            request.setAttribute("oberr", "Case already posted");
            url = "/UnidentifiedPersonDemograhics.jsp";
        }
        RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
        disp.forward(request, response);
    }

    public void serveInfo(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        HttpSession session = request.getSession();
        String pcolor = (String) request.getParameter("pcolor");
        String ecolor = (String) request.getParameter("ecolor");
        String hcolor = (String) request.getParameter("hcolor");
        String description = (String) request.getParameter("pdesc");
        String age = (String) session.getAttribute("age");
        weight = (String) session.getAttribute("weight");
        height = (String) session.getAttribute("height");
        personId = (String) session.getAttribute("personId");
        DataInsertionWrapper.saveDescription(personId, weight, height, description.toUpperCase(), ecolor.toUpperCase(),
                pcolor.toUpperCase(), hcolor.toUpperCase(), age);
        String url = "/UnidentifiedLocation.jsp";
        RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
        disp.forward(request, response);
    }

    public void serveDist(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        PrintWriter out = response.getWriter();
        String url;
        HttpSession session = request.getSession();
        String disttype = (String) request.getParameter("disttype");
        String distd = (String) request.getParameter("distd");
        personId = (String) session.getAttribute("personId");
        DataInsertionWrapper.saveFeature(personId, disttype, distd);
        out.print(" <script type='text/javascript' src='resources/vendor/jquery/jquery.min.js'></script>");
        out.print(" <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js'></script>");
        out.print(" <script type='text/javascript' src='resources/js/AlertSuccess.js'></script>");

        url = "/ProfDashBoard.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.include(request, response);

    }

    public void serveLoc(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        PrintWriter out = response.getWriter();
        String url = null;
        HttpSession session = request.getSession();
        String county = (String) request.getParameter("county");
        String constituency = (String) request.getParameter("constituency");
        String ward = (String) request.getParameter("ward");
        String village = (String) request.getParameter("village");
        String distinct = (String) request.getParameter("distinct");
        System.out.println(distinct);
        String org = (String) session.getAttribute("myOrg");
        personId = (String) session.getAttribute("personId");
        String reporter = (String) session.getAttribute("email");
        String id = (String) session.getAttribute("id");
        DataInsertionWrapper.addLocation(personId, "NONE", county.toUpperCase(), constituency.toUpperCase(), ward.toUpperCase(), village.toUpperCase());
        CaseDAO.saveCase("Unidentified", "Open", personId, reporter.toUpperCase(), org, id);

        if (distinct == null) {
            out.print(" <script type='text/javascript' src='resources/vendor/jquery/jquery.min.js'></script>");
            out.print(" <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js'></script>");
            out.print(" <script type='text/javascript' src='resources/js/AlertSuccess.js'></script>");
            url = "/ProfDashBoard.jsp";
        } else if (distinct.equals("dist")) {
            url = "/UnidentifiedDistinct.jsp";
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.include(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
