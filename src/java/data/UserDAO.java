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
import java.util.UUID;

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
    public static void saveUser(String fname, String sname, String id, String pass, String email, String phone, String locationId) throws SQLException {
        query = "insert into publicuser(email, id, fname, sname, phone,"
                + "date, password, locationId, role) values(?, ?, ?, ?, ?, curdate(), ?, ?, ?)";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, email);
        pState.setString(2, id);
        pState.setString(3, fname);
        pState.setString(4, sname);
        pState.setString(5, phone);
        pState.setString(6, pass);
        pState.setString(7, locationId);
        pState.setString(8, "publicuser");
        pState.executeUpdate();
        System.out.println("User successfully inserted");
    }
    //save a new staff user added to the system

    public static void saveStaff(String email, String id, String fname, String sname,
            String phone, String role, String pass, String addedby, String orgid) throws SQLException {

        query = "insert into staff(email, id, fname, sname, phone,"
                + "role, password, addedby,orgid, date  ) values(?, ?, ?, ?, ?, ?, ?, ?, ? , curdate())";

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, email);
        pState.setString(2, id);
        pState.setString(3, fname);
        pState.setString(4, sname);
        pState.setString(5, phone);
        pState.setString(6, role);
        pState.setString(7, pass);
        pState.setString(8, addedby);
        pState.setString(9, orgid);
        pState.executeUpdate();
        System.out.println("Staff successfully inserted");
    }

    //Validate user login credentials
    public static String validateUser(String email, String password) throws SQLException {
        String role = null;
        query = "select * from publicuser where email= ?  and "
                + "password = ? ";

        conn = DatabaseConnection.getConnection();

        pState = conn.prepareStatement(query);
        pState.setString(1, email);
        pState.setString(2, password);

        rSet = pState.executeQuery();

        while (rSet.next()) {
            role = rSet.getString("role");

            if (role == null) {
                role = "error";
            }

        }
        // System.out.println(role);

        return role;
    }

    public static boolean verifyExisting(String id, String action) throws SQLException {
        boolean exists = false;
        if (action.equals("add")) {
            query = "select personid from staff where personid = ? ";
        } else {
            query = "select id from user where id = ? ";
        }
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, id);
        rSet = pState.executeQuery();

        if (rSet.next()) {
            exists = true;

        }

        return exists;

    }

    //Add a staff user into the database
    public static int CreateUser(String id, String fName, String sName,
            String type, String addedby, String email, String phone) {

        PreparedStatement prepstat;
        String password = id;
        String query = "INSERT INTO staff (personid,fname, sname, "
                + "type,phone, password,email, date, addedby ) VALUES " + "(?,?,?,?,?,?, ?, curdate(),?)";
        try {

            //create a connection
            prepstat = DatabaseConnection.getConnection().prepareStatement(query);
            prepstat.setString(1, id);
            prepstat.setString(2, fName);
            prepstat.setString(3, sName);
            prepstat.setString(4, type);
            prepstat.setString(5, phone);
            prepstat.setString(6, password);
            prepstat.setString(7, email);

            prepstat.setString(8, addedby);

            return prepstat.executeUpdate();

        } catch (SQLException err) {
            return 0;

        }
    }

    public static String generateId(String type) {
        String pre = null;

        if ("missing".equals(type)) {
            pre = "MP";
        } else if ("unidentified".equals(type)) {
            pre = "UP";
        }
        String gen = (UUID.randomUUID().toString()).substring(0, 6).toUpperCase();
        String id = pre + gen;
        return id;
    }
}
