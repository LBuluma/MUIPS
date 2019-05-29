/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import Case.Case;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

/**
 *
 * @author justus
 */
public class CaseDAO {

    static PreparedStatement pState;
    static ResultSet rSet;
    static String query;
    static Connection conn;
    static ArrayList list;

    //Add a new case into the database
    public static void saveCase(String case_type, String case_status, String personId,
            String case_reporter, String orgdetails) throws SQLException {
        query = "insert into cases(type, personId,status, reporter, date, org) values ( ?, ?, ?, ?, curdate(), ?)";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);

        pState.setString(1, case_type);
        pState.setString(2, personId);
        pState.setString(3, case_status);
        pState.setString(4, case_reporter);
        pState.setString(5, orgdetails);
        pState.executeUpdate();
        System.out.println("Case Successfully added");

    }

    //Auto generate the case identification numbers 
    public static String generateId(String type) {
        String pre = null;

        if ("missing".equals(type)) {
            pre = "MP";
        } else if ("unidentified".equals(type)) {
            pre = "UP";
        }
        int profile = Calendar.getInstance().get(Calendar.YEAR) - 2000;

        String gen = (UUID.randomUUID().toString()).substring(0, 6).toUpperCase();
        String id = pre + "-" + gen + "-" + profile;
        return id;
    }

    public static String retrieveCase(String id, String role) throws SQLException {

        String type = null;
        String personid = null;

        if (role.equals("publicuser")) {
            query = "select personid from cases where reporter = ? and type = ? ";
            type = "missing";
        } else if (role.equals("staff")) {
            query = "select personid from cases where reporter = ? and type = ? ";
            type = "unidentified";
        }
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, id);
        pState.setString(2, type);
        rSet = pState.executeQuery();

        while (rSet.next()) {
            personid = rSet.getString("personid");
        }

        System.out.println("personid retrieved successfully");
        return personid;
    }

    public static void resolveCase(String personid) throws SQLException {
        query = "update cases set status = ? where personid = ? ";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, "closed");
        pState.setString(2, personid);
        pState.executeUpdate();
        System.out.println("Case closed successfully");
    }

    public static ArrayList retrieveCases(String type) throws SQLException {
        query = "select status, personid,date, org from cases where type = ? ";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, type);

        rSet = pState.executeQuery();
        list = new ArrayList();
        Case c;
        while (rSet.next()) {
            c = new Case();
            c.setCase_id(rSet.getString("personid"));
            c.setCase_status(rSet.getString("status"));
            c.setDateadded(rSet.getString("date"));
            c.setInvest_agency(rSet.getString("org"));
            list.add(c);
        }
        System.out.println("cases gotten successfully");
        return list;
    }

    public static ArrayList retrieveMyPosts(String email, String role) throws SQLException {

        String type = null;

        if (role.equals("publicuser")) {
            query = "select * from cases where reporter=? and type=? ";
            type = "missing";
        } else if (role.equals("prof")) {
            query = "select * from cases where reporter=? and type =? ";
            type = "unidentified";
        }
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, email);
        pState.setString(2, type);
        rSet = pState.executeQuery();
        System.out.println(rSet);
        Case c;
        list = new ArrayList();
        while (rSet.next()) {
            c = new Case();
            System.out.println(rSet.getString("personid"));
            c.setCase_id(rSet.getString("personid"));
            c.setCase_status(rSet.getString("status"));
            c.setDateadded(rSet.getString("date"));
            c.setInvest_agency(rSet.getString("org"));
            list.add(c);
        }
        System.out.println("case gotten successfully");
        return list;
    }

    public static ResultSet retrievePost(String type) throws SQLException {
        query = "select * from cases where type = ? ";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, type);

        return pState.executeQuery();

    }

    public static void saveImage(String type, String id, String path) throws SQLException {

        System.out.println(type);
        System.out.println(id);
        System.out.println(path);
        String query1 = "insert into file(personid, type, path) values (?, ? , ?)";

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query1);
        pState.setString(1, id);
        pState.setString(2, type);
        pState.setString(3, path);
        pState.executeUpdate();

        System.out.println("Path successfully updated");
    }
}
