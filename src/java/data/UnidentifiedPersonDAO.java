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

public class UnidentifiedPersonDAO {

    static PreparedStatement pState;
    static ResultSet rSet;
    static String query;
    static Connection conn;

    //Add missing person to the database
    public static void saveUnidentifiedPerson(String fname, String sname, String personId, String ethnicity,
            String gender, String date_found, String language) throws SQLException {
        query = "insert into unidentifiedperson(personid, fname, sname, ethicity, datefound, langauge, gender) values (?, ?, ?, ?, ?, ?, ?)";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, personId);
        pState.setString(2, fname);
        pState.setString(3, sname);
        pState.setString(4, ethnicity);
        pState.setString(5, date_found);
        pState.setString(6, language);
        pState.setString(7, gender);
       
        pState.executeUpdate();
        System.out.println("Unidentified person Successfully added");

    }
}
