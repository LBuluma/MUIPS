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

/**
 *
 * @author justus
 */
public class CaseDAO {

    static PreparedStatement pState;
    static ResultSet rSet;
    static String url;
    static Connection conn;
    static ArrayList list;

    public static void saveCase( String case_type, String case_status, String personId,
            String case_reporter,String orgdetails) throws SQLException {
        url = "insert into cases(type, personId, reporter, date, org) values ( ?, ?, ?, curdate(), ?)";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(url);
       
        pState.setString(1, case_type);
        pState.setString(2, personId);
        pState.setString(3, case_reporter);
        pState.setString(4, orgdetails);
        pState.executeUpdate();
        System.out.println("Case Successfully added");

    }
}
