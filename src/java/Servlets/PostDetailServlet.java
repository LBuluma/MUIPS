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
import data.DataRetrievalWrapper;
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
public class PostDetailServlet extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String caseid = (String) session.getAttribute("caseid");
        String role = (String) session.getAttribute("role");
        String url = null ;
        try {
            
            Description desc = DataRetrievalWrapper.getDescription(caseid);
            Transportation trans = DataRetrievalWrapper.getTransportation(caseid);
              
            if (role.equals("professional")) {
                UnidentifiedPerson person = DataRetrievalWrapper.getUPerson(caseid);
                 request.setAttribute("person", person);
                url = "/PublicMyPost.jsp";
            } else {
                MissingPerson person = DataRetrievalWrapper.getMPerson(caseid);
                 request.setAttribute("person", person);
                 url = "/ProfessionalMyPost.jsp";
            }
            request.setAttribute("description", desc);
            request.setAttribute("transportation",trans );
           
        } catch (SQLException ex) {
            Logger.getLogger(RetrieveMyPostServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
        disp.forward(request, response);
    }

}
