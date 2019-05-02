/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import data.CaseDAO;
import data.DataInsertionWrapper;
import data.UserDAO;
import java.io.IOException;
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
public class ReportCaseServlet extends HttpServlet {

    String fname;
    String sname;
    String language;
    String gender;
    String ethnic;
    String tribe;
    String weight;
    String height;
    String personId;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("action");
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = (String) request.getParameter("action");
        System.out.println(action);

        switch (action) {
            case "demo":
                serveDemo(request, response);
                break;
            case "info":
                try {
                    serveInfo(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(ReportCaseServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "trans":
                try {
                    serveTrans(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(ReportCaseServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "distinct":
                try {
                    serveDist(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(ReportCaseServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "location":
                try {
                    serveLoc(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(ReportCaseServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                break;
        }
    }

    public void serveDemo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        fname = (String) request.getParameter("fname");
        session.setAttribute("fname", fname);
        sname = (String) request.getParameter("sname");
        session.setAttribute("sname", sname);
        language = (String) request.getParameter("language");
        session.setAttribute("language", language);
        gender = (String) request.getParameter("gender");
        session.setAttribute("gender", gender);
        ethnic = (String) request.getParameter("ethnic");
        session.setAttribute("ethnic", ethnic);
        tribe = (String) request.getParameter("tribe");
        session.setAttribute("tribe", tribe);
        weight = (String) request.getParameter("weight");
        session.setAttribute("weight", weight);
        height = (String) request.getParameter("height");
        session.setAttribute("height", height);
        String age = (String) request.getParameter("age");
        session.setAttribute("age", age);
       

        String url = "/MissingPersonInfo.jsp";
        RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
        disp.forward(request, response);
    }

    public void serveInfo(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        HttpSession session = request.getSession();
        String pcolor = (String) request.getParameter("pcolor");
        String ecolor = (String) request.getParameter("ecolor");
        String id_number = (String) request.getParameter("pid");
        String hcolor = (String) request.getParameter("hcolor");
        String pdesc = (String) request.getParameter("pdesc");
        String last_contact = (String) request.getParameter("lastcontact");
        fname = (String) session.getAttribute("fname");
        sname = (String) session.getAttribute("sname");
        gender = (String) session.getAttribute("gender");
        ethnic = (String) session.getAttribute("ethnic");
        tribe = (String) session.getAttribute("tribe");
        weight = (String) session.getAttribute("weight");
        height = (String) session.getAttribute("height");
       
        String age = (String) session.getAttribute("age");
       personId = UserDAO.generateId("missing");
       session.setAttribute("personId", personId);

        DataInsertionWrapper.saveMissingPerson(fname, sname, personId, ethnic, gender, last_contact, id_number, language);
        DataInsertionWrapper.saveDescription(personId, weight, weight, pdesc, ecolor, pcolor, hcolor, age);

        String url = "/LocationInfo.jsp";
        RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
        disp.forward(request, response);
    }

    public void serveTrans(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        HttpSession session = request.getSession();
        String transd = (String) request.getParameter("transd");
        String make = (String) request.getParameter("make");
        String transtype = (String) request.getParameter("transtype");
        String transcolor = (String) request.getParameter("transcolor");
        String model = (String) request.getParameter("model");

        personId = (String) session.getAttribute("personId");
        DataInsertionWrapper.saveTransportation(personId, transtype, model, make, transcolor, transd);
        RequestDispatcher disp = getServletContext().getRequestDispatcher("/PublicUserProfile.jsp");
        disp.forward(request, response);
    }

    public void serveDist(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String url = null;
        HttpSession session = request.getSession();
        String disttype = (String) request.getParameter("disttype");
        String distd = (String) request.getParameter("distd");
        personId = (String) session.getAttribute("personId");
        DataInsertionWrapper.saveFeature(personId, disttype, distd);
        String trans = (String) session.getAttribute("trans");
        if(trans.equals("trans")){
            url= "/Transportation.jsp";
        }else{
            url = "/RetrieveProfile";
        }
        RequestDispatcher  dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }

    public void serveLoc(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException,IOException {
        String url = null;
        HttpSession session = request.getSession();
        String county = (String) request.getParameter("county");
        String constituency = (String) request.getParameter("constituency");
        String ward = (String) request.getParameter("ward");
        String village = (String) request.getParameter("village");
        String distinct = (String) request.getParameter("distinct");
        System.out.println(distinct);
        String trans = (String) request.getParameter("transp");
          System.out.println(trans);
        session.setAttribute("trans", trans);
        String org = (String) request.getParameter("org");
        personId = (String) session.getAttribute("personId");
        String reporter = (String) session.getAttribute("email");
        DataInsertionWrapper.addLocation(personId, "none", county, constituency, ward, village);
        CaseDAO.saveCase("Missing", "Open", personId, reporter, org);
        
        if(distinct.equals("dist")){
            url = "/DistinctFeature.jsp";
            
        }else if(!(distinct.equals("dist"))&& (trans.equals("trans"))){
            url = "/Transportation.jsp";
        }else{
            url = "/PublicUserProfile.jsp";
        }
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
