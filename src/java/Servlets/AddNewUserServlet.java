/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;


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
 * @author luganu
 */
public class AddNewUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String id = request.getParameter("id");
            String action = "add";
            boolean exist = UserDAO.verifyExisting(id,action);
            if(exist == true){
                System.out.println("error");
                request.setAttribute("usrerr", "User already exists");
            }else{
                String fname = request.getParameter("fname");
                String sname = request.getParameter("sname");
                
                String email = request.getParameter("email");
                String phone = request.getParameter("phone");
                HttpSession session = request.getSession();
                
                String addedby = (String) session.getAttribute("name");
                
                UserDAO.CreateUser(id, fname, sname, "Officer", addedby, email, phone);
                request.setAttribute("usrsuccess", "User created successfully");
            }
            String path = "/AddNewUser.jsp";
            RequestDispatcher dispatcher = request.getRequestDispatcher(path);
            dispatcher.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddNewUserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}