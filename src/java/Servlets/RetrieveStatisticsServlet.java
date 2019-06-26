/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import data.CaseDAO;
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

/**
 *
 * @author justus
 */
public class RetrieveStatisticsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action.equals("cons")) {
            try {
                serveCons(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(RetrieveStatisticsServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (action.equals("all")) {
            try {
                serveCounty(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(RetrieveStatisticsServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void serveCons(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String constituency = request.getParameter("constituency");
        if(constituency.equals("Whole county")){
            serveCounty(request, response);
        }else{
        String start = request.getParameter("startDate");
        String stop = request.getParameter("stopDate");
        int openU = CaseDAO.conCases(constituency, "unidentified", "open", start, stop);
        int resolvedU = CaseDAO.conCases(constituency, "unidentified", "resolved", start, stop);
        int resolvedM = CaseDAO.conCases(constituency, "missing", "resolved", start, stop);
        int openM = CaseDAO.conCases(constituency, "missing", "open", start, stop);
        request.setAttribute("openM", openM);
        request.setAttribute("openU", openU);
        request.setAttribute("resolvedU", resolvedU);
        request.setAttribute("resolvedM", resolvedM);
        RequestDispatcher disp = getServletContext().getRequestDispatcher("/ViewStat.jsp");

        disp.forward(request, response);
        }
    }

    private void serveCounty(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String start = request.getParameter("startDate");
        String stop = request.getParameter("stopDate");
        int openU = CaseDAO.countCaseType("unidentified", "open", start, stop);
        int resolvedU = CaseDAO.countCaseType("unidentified", "resolved",start, stop);
        int resolvedM = CaseDAO.countCaseType("missing", "resolved",start, stop);
        int openM = CaseDAO.countCaseType("missing", "open",start, stop);
        request.setAttribute("openM", openM);
        request.setAttribute("openU", openU);
        request.setAttribute("resolvedU", resolvedU);
        request.setAttribute("resolvedM", resolvedM);
        RequestDispatcher disp = getServletContext().getRequestDispatcher("/ViewStat.jsp");
        disp.forward(request, response);
    }

}
