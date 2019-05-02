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

public class DataRetrievalWrapper {

    static PreparedStatement pState;
    static ResultSet rSet;
    static String url;
    static Connection conn;
    static ArrayList list;

    
    public static ArrayList getProfile(String email) throws SQLException {
        list = new ArrayList();
        String locationId = null;
        url = "select * from publicuser where email= ? ";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(url);

        pState.setString(1, email);
        rSet = pState.executeQuery();
        while (rSet.next()) {
            list.add(rSet.getString("email"));
            list.add(rSet.getString("fname"));
            list.add(rSet.getString("sname"));
            list.add(rSet.getString("phone"));
            list.add(rSet.getString("id"));
            locationId = rSet.getString("locationId");
        }
        System.out.println("Profile Gotten");
        
        
        url = "select * from location where id= ? ";
        pState = conn.prepareStatement(url);
        pState.setString(1, locationId);
        rSet = pState.executeQuery();
        
        while (rSet.next()) {
            list.add(rSet.getString("address"));
            list.add(rSet.getString("constituency"));
            list.add(rSet.getString("county"));
            list.add(rSet.getString("ward"));
        }
        System.out.println("Location Gotten");
        return list;
    }
     public static ArrayList fetchUsers() throws SQLException {
        String role = null;
        url = "select * from publicuser";            
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(url);
        rSet = pState.executeQuery();
        list = new ArrayList();
        while (rSet.next()) {
            role = rSet.getString("email");
            list.add(role);

            }

       System.out.println(role);

        return list;
    }


}
