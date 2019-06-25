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
                int openU = CaseDAO.countCaseType("unidentified", "open");
                int resolvedU = CaseDAO.countCaseType("unidentified", "resolved");
                int resolvedM = CaseDAO.countCaseType("missing", "resolved");
                int openM = CaseDAO.countCaseType("missing", "open");
                request.setAttribute("openM", openM);
                request.setAttribute("openU", openU);
                request.setAttribute("resolvedU", resolvedU);
                request.setAttribute("resolvedM", resolvedM);
            } catch (SQLException ex) {
                Logger.getLogger(RetrieveStatisticsServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        RequestDispatcher disp = getServletContext().getRequestDispatcher("/ViewStat.jsp");
        disp.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void serveCons(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String constituency = request.getParameter("constituency");
        int openU = CaseDAO.conCases(constituency, "unidentified", "open");
        int resolvedU = CaseDAO.conCases(constituency, "unidentified", "resolved");
        int resolvedM = CaseDAO.conCases(constituency, "missing", "resolved");
        int openM = CaseDAO.conCases(constituency, "missing", "open");
        request.setAttribute("openM", openM);
        request.setAttribute("openU", openU);
        request.setAttribute("resolvedU", resolvedU);
        request.setAttribute("resolvedM", resolvedM);
    }

}
