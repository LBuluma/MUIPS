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

/**
 *
 * @author justus
 */
public class DataInsertionWrapper {

    static PreparedStatement pState;
    static ResultSet rSet;
    static String url;
    static Connection conn;

    

    //Save location of a user or a reported victim
    public static void addLocation(String locationId, String address, String county, 
            String constituency, String ward, String village) throws SQLException {
        url = "insert into location(id, address, county, constituency, ward, village) values (?, ?, ?, ?, ?, ?)";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(url);
        pState.setString(1, locationId);
        pState.setString(2, address);
        pState.setString(3, county);
        pState.setString(4, constituency);
        pState.setString(5, ward);
        pState.setString(6, village);
        pState.executeUpdate();
        System.out.println("location Successfully Added");

    }



    

    //Add missing person to the database
    public static void saveMissingPerson(String fname, String sname, String personId, String ethnicity,
            String gender, String last_contact, String id_number, String language) throws SQLException {
        url = "insert into missingperson(personid, fname, sname, ethnicity, lastcontact, language, gender, idnumber) values (?, ?, ?, ?, ?, ?, ?, ?)";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(url);
        pState.setString(1, personId);
        pState.setString(2, fname);
        pState.setString(3, sname);
        pState.setString(4, ethnicity);
        pState.setString(5, last_contact);
        pState.setString(6, language);
        pState.setString(7, gender);
        pState.setString(8, id_number);
        pState.executeUpdate();
        System.out.println("Missing person Successfully added");

    }

    //Add Transporation to the database
    public static void saveTransportation(String personId, String type, String model, String make,
            String color, String description) throws SQLException {
        url = "insert into transportation(personid, type, make, model, description, color ) values (?, ?, ?, ?, ?, ?)";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(url);
        pState.setString(1, personId);
        pState.setString(2, type);
        pState.setString(3, model);
        pState.setString(4, make);
        pState.setString(5, description);
        pState.setString(6, color);
        pState.executeUpdate();
        System.out.println("Transportation Successfully added");

    }

    //Add distinct feature to the database
    public static void saveFeature(String personId, String type, String description) throws SQLException {
        url = "insert into feature(personid, type, description ) values (?, ?, ?)";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(url);
        pState.setString(1, personId);
        pState.setString(2, type);
        pState.setString(3, description);
        pState.executeUpdate();
        System.out.println("Feature Successfully added");

    }
     //Add distinct feature to the database
    public static void saveDescription(String personId, String weight, String height, String description,
            String eye_color, String color, String hair_color, String age) throws SQLException {
        
        url = "insert into description(personid,weight, height, eyecolor, haircolor, "
                + "color, age, description ) values (?, ?, ?, ?, ?, ?, ?, ?)";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(url);
        pState.setString(1, personId);
        pState.setString(2, weight);
        pState.setString(3, height);
        pState.setString(4, eye_color);
        pState.setString(5, hair_color);
        pState.setString(6, color);
        pState.setString(7, age);
        pState.setString(8, description);
        pState.executeUpdate();
        System.out.println("Description Successfully added");

    }
}
