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
import Location.Location;
import data.DataRetrievalWrapper;
import data.Organization;
import java.io.IOException;
import java.sql.SQLException;
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
public class RetriveCaseDetailsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String type = request.getParameter("type");
        String postId = request.getParameter("postId");
        String path2 = null;

        String path = null;
        Location loc = null;
        Description desc = null;
        Description desc2 = null;
        Description desc3;
        String path3 = null;
        Transportation trans;
        Organization org = null;
        String name = null;
        try {
            name = DataRetrievalWrapper.getOrgId(postId);
            org = DataRetrievalWrapper.fetchOrg(name);
            path = DataRetrievalWrapper.getPath(postId, "distinct");

        } catch (SQLException ex) {
            Logger.getLogger(RetriveCaseDetailsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (type.equals("missing")) {
            try {
                desc2 = DataRetrievalWrapper.getFeature(postId);
                path2 = DataRetrievalWrapper.getPath(postId, "missing");
                MissingPerson person;
                person = DataRetrievalWrapper.getMPerson(postId);
                loc = DataRetrievalWrapper.getLocation(postId);
                trans = DataRetrievalWrapper.getTransportation(postId);
                request.setAttribute("trans", trans);
                desc = DataRetrievalWrapper.getDescription(postId);
                desc2 = DataRetrievalWrapper.getFeature(postId);

                request.setAttribute("person", person);

            } catch (SQLException ex) {
                Logger.getLogger(RetriveCaseDetailsServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (type.equals("unidentified")) {

            try {
                path3 = DataRetrievalWrapper.getPath(postId, "uniden");
               
                UnidentifiedPerson person;
                person = DataRetrievalWrapper.getUPerson(postId);
                loc = DataRetrievalWrapper.getLocation(postId);
                desc = DataRetrievalWrapper.getDescription(postId);
                desc2 = DataRetrievalWrapper.getFeature(postId);

              
                request.setAttribute("person", person);
            } catch (SQLException ex) {
                Logger.getLogger(RetriveCaseDetailsServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println(path3 +"path3");
        request.setAttribute("org", org);
        request.setAttribute("type", type);
        request.setAttribute("path", path);
        request.setAttribute("path3", path3);
        request.setAttribute("path2", path2);
        
        request.setAttribute("location", loc);
        request.setAttribute("descri", desc);
        request.setAttribute("feature", desc2);
        String url = "/PostDetails.jsp";
        RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
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
