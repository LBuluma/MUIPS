package Servlets;

import com.google.gson.Gson;
import data.DataRetrievalWrapper;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author justus
 */
public class RetriveConstituencyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String county = request.getParameter("county");
            System.out.println(county);
            ArrayList cons = DataRetrievalWrapper.getCons(county);
            response.setContentType("application/json");
            
         new Gson().toJson(cons, response.getWriter());
        } catch (SQLException ex) {
            Logger.getLogger(RetriveConstituencyServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
