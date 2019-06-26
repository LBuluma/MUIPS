/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import user.User;

/**
 *
 * @author justus
 */
public class UserDAO {

    static PreparedStatement pState;
    static ResultSet rSet;
    static String query;
    static Connection conn;

    //Save new public user to the database
    public static void saveUser(String fname, String sname, String id, String pass, String email, String phone) throws SQLException {
        query = "insert into publicuser(email, id, fname, sname, phone,"
                + "date, password, org, role) values(?, ?, ?, ?, ?, curdate(), ?, ?)";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, email);
        pState.setString(2, id);
        pState.setString(3, fname);
        pState.setString(4, sname);
        pState.setString(5, phone);
        pState.setString(6, pass);
        pState.setString(7, "blank");
        pState.setString(8, "publicuser");
        pState.executeUpdate();
        System.out.println("User successfully inserted");
    }
    //save a new staff user added to the system

    public static void saveProf(String email, String id, String fname, String sname,
            String phone, String pass, String org) throws SQLException {

        query = "insert into publicuser(email, id, fname, sname, phone,"
                + "date, password, org,role, status ) values(?, ?, ?, ?, ?, curdate(),?, ?, ?, ?)";

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, email);
        pState.setString(2, id);
        pState.setString(3, fname);
        pState.setString(4, sname);
        pState.setString(5, phone);
        pState.setString(6, pass);
        pState.setString(7, org);
        pState.setString(8, "prof");
        pState.setString(9, "pending");
        pState.executeUpdate();
        System.out.println("Prof successfully added");
    }

    //Validate user login credentials
    public static User validateUser(String email, String password) throws SQLException {
        User usr = new User();
        query = "select * from publicuser where email= ?  and "
                + "password = ? ";

        conn = DatabaseConnection.getConnection();

        pState = conn.prepareStatement(query);
        pState.setString(1, email);
        pState.setString(2, password);

        rSet = pState.executeQuery();

        while (rSet.next()) {
            usr.setUser_email(rSet.getString("email"));
            usr.setUser_pass(rSet.getString("password"));

            if (usr.getUser_email().equals(email) && (usr.getUser_pass().equals(password))) {
                usr.setUser_fname(rSet.getString("fname"));
                usr.setUser_sname(rSet.getString("sname"));
                usr.setUser_role(rSet.getString("role"));
                usr.setUser_org(rSet.getString("org"));
                usr.setUser_status(rSet.getString("status"));

            } else {
                usr = new User();
            }

        }
        return usr;

    }

    public static boolean verifyExisting(String id) throws SQLException {
        boolean exists = false;

        query = "select id from publicuser where email = ? ";

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, id);
        rSet = pState.executeQuery();

        if (rSet.next()) {
            exists = true;

        }

        return exists;

    }

    public static int changePass(String username, String newpw, String oldpwd) throws SQLException {
        query = "update publicuser set password=? where email = ? and password = ?";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, newpw);
        pState.setString(2, username);
        pState.setString(3, oldpwd);
        return pState.executeUpdate();

    }

    public static ArrayList viewUsers() throws SQLException {
        query = "select * from publicuser where role = ? and status = ?";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, "prof");
        pState.setString(2, "approved");
        rSet = pState.executeQuery();
        ArrayList list = new ArrayList();
        User usr = new User();
        while (rSet.next()) {
            usr.setUser_sname(rSet.getString("sname"));
            usr.setUser_fname(rSet.getString("fname"));
            usr.setUser_org(rSet.getString("org"));
            usr.setUser_phone(rSet.getString("phone"));
            usr.setDate_added(rSet.getString("date"));
            usr.setUser_email(rSet.getString("email"));
            list.add(usr);
        }

        return list;
    }

    public static ArrayList unapprovedUsers(String status) throws SQLException {
        query = "select * from publicuser where role = ? and status = ?";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, "prof");
        pState.setString(2, status);
        rSet = pState.executeQuery();
        ArrayList list = new ArrayList();
        User usr = new User();
        while (rSet.next()) {
            usr.setUser_sname(rSet.getString("sname"));
            usr.setUser_fname(rSet.getString("fname"));
            usr.setUser_org(rSet.getString("org"));
            usr.setUser_phone(rSet.getString("phone"));
            usr.setDate_added(rSet.getString("date"));
            usr.setUser_email(rSet.getString("email"));
            list.add(usr);
        }

        return list;
    }

    public static void changeUserStatus(String email, String status) throws SQLException {
        query = "update publicuser set status=? where email=?";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, status);
        pState.setString(2, email);
        pState.executeUpdate();
        System.out.println("Status changed");
    }

    public static String usrStation(String usrId) throws SQLException {
        query = "select org from publicuser where email = ?";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, usrId);

        rSet = pState.executeQuery();
        String station = null;
        while (rSet.next()) {
            station = rSet.getString("org");
        }

        System.out.println("Station gotten");
        return station;
    }
}
