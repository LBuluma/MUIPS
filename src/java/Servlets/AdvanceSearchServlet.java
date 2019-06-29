/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Case.Case;
import Case.Description;
import Case.MissingPerson;
import Case.Transportation;
import Case.UnidentifiedPerson;
import Location.Location;
import data.CaseDAO;
import java.io.IOException;
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
public class AdvanceSearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String type = (String) request.getParameter("type");
        if (type.equals("missing")) {
            try {
                searchM(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(AdvanceSearchServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (type.equals("unidentified")) {
            try {
                searchU(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(AdvanceSearchServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void searchM(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        MissingPerson person = new MissingPerson();
        Location loc = new Location();
        Description desc = new Description();
        Transportation trans = new Transportation();
        person.setPerson_fname((String) request.getParameter("fname"));
        person.setPerson_sname((String) request.getParameter("sname"));
        loc.setConstituency((String) request.getParameter("constituency")); 
        person.setGender((String) request.getParameter("gender"));
        person.setEthnicity((String) request.getParameter("ethnicity"));
        desc.setColor((String) request.getParameter("color"));
        desc.setDistinctive_feature((String) request.getParameter("feature"));
        trans.setColor((String) request.getParameter("trans_color"));
        trans.setModel((String) request.getParameter("model"));
        trans.setTrans_type((String) request.getParameter("trans_type"));
        int minAge = Integer.parseInt(request.getParameter("minAge"));
        int maxAge = Integer.parseInt(request.getParameter("maxAge"));
        int minH = Integer.parseInt(request.getParameter("minH"));
        int maxH = Integer.parseInt(request.getParameter("maxH"));
        int maxW = Integer.parseInt(request.getParameter("maxW"));
        int minW = Integer.parseInt(request.getParameter("minW"));

        ArrayList <Case>caseList = CaseDAO.searchMCase(loc,  person, desc, minAge, maxAge, maxH, minH, minW, maxW);
        System.out.println("missing person gotten");
        request.setAttribute("caseList", caseList);
        request.setAttribute("type", "missing");
        RequestDispatcher disp = getServletContext().getRequestDispatcher("/ViewPosts.jsp");
        disp.include(request, response);


    }

    private void searchU(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        UnidentifiedPerson person = new UnidentifiedPerson();
        Location loc = new Location();
        Description desc = new Description();
        
        person.setPerson_fname((String) request.getParameter("fname"));
        person.setPerson_sname((String) request.getParameter("sname"));
        loc.setConstituency((String) request.getParameter("constituency"));
        person.setGender((String) request.getParameter("gender"));
        person.setEthnicity((String) request.getParameter("ethnicity"));
        desc.setColor((String) request.getParameter("color"));
        desc.setDistinctive_feature((String) request.getParameter("feature"));
        
        int minAge = Integer.parseInt(request.getParameter("minAge"));
        int maxAge = Integer.parseInt(request.getParameter("maxAge"));
        int minH = Integer.parseInt(request.getParameter("minH"));
        int maxH = Integer.parseInt(request.getParameter("maxH"));
        int maxW = Integer.parseInt(request.getParameter("maxW"));
        int minW = Integer.parseInt(request.getParameter("minW"));

        ArrayList <Case>caseList = CaseDAO.searchUCase(loc,  person,  desc, minAge, maxAge, maxH, minH, minW, maxW);
                System.out.println("Unidentified person gotten");
         request.setAttribute("caseList", caseList);
         request.setAttribute("type", "unidentified");
        RequestDispatcher disp = getServletContext().getRequestDispatcher("/ViewPosts.jsp");
        disp.include(request, response);


    }
}
