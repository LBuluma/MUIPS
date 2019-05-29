/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import com.google.gson.Gson;
import data.CaseDAO;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class RetrieveDataServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        Gson gsonObj = new Gson();
        Map<Object, Object> map;
        List<Map<Object, Object>> list = new ArrayList<>();
        String dataPoints = null;
        String type = request.getParameter("type");
        String xVal, yVal;
        ResultSet rSet = CaseDAO.retrievePost(type);

        while (rSet.next()) {
            xVal = rSet.getString("x");
            yVal = rSet.getString("y");
            map = new HashMap<>();
            map.put("x", Double.parseDouble(xVal));
            map.put("y", Double.parseDouble(yVal));
            list.add(map);
            dataPoints = gsonObj.toJson(list);
        }
        request.setAttribute("dataPoints", dataPoints);
        rSet.close();
        String url = "/Charts.jsp";
        RequestDispatcher disp = getServletContext().getRequestDispatcher(url);
        disp.include(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(RetrieveDataServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
