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

    public static void saveProf(String email, String id, String fname, String sname,
            String phone, String pass, String org, String orgEmail) throws SQLException {

        query = "insert into publicuser(email, id, fname, sname, phone,"
                + "date, password, locationid, org,role, orgemail ) values(?, ?, ?, ?, ?, curdate(),?, ?, ?, ?, ? )";

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, email);
        pState.setString(2, id);
        pState.setString(3, fname);
        pState.setString(4, sname);
        pState.setString(5, phone);
        pState.setString(6, pass);
        pState.setString(7, "unknown");
        pState.setString(8, org);

        pState.setString(9, "prof");
        pState.setString(10, orgEmail);
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
            usr.setUser_fname(rSet.getString("fname"));
            usr.setUser_sname(rSet.getString("sname"));
            usr.setUser_role(rSet.getString("role"));
        }
        System.out.println(usr.getUser_role());

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

}
