/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import Case.Description;
import Case.MissingPerson;
import Case.Transportation;
import Case.UnidentifiedPerson;
import Location.Location;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataRetrievalWrapper {

    static PreparedStatement pState;
    static ResultSet rSet;
    static String query;
    static Connection conn;
    static ArrayList list;

    public static ArrayList getProfile(String email) throws SQLException {
        list = new ArrayList();
        String locationId = null;
        query = "select * from publicuser where email= ? ";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);

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

        query = "select * from location where id= ? ";
        pState = conn.prepareStatement(query);
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
        query = "select * from publicuser";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        rSet = pState.executeQuery();
        list = new ArrayList();
        while (rSet.next()) {
            role = rSet.getString("email");
            list.add(role);

        }

        System.out.println(role);

        return list;
    }

    public static Description getDescription(String personid) throws SQLException {

        query = "select weight, height, eyecolor, haircolor, "
                + "color, age, description from description where personid = ? ";

        Description description = new Description();

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, personid);
        rSet = pState.executeQuery();
        while (rSet.next()) {
            description.setWeight(rSet.getString("weight"));
            description.setHeight(rSet.getString("height"));
            description.setEye_color(rSet.getString("eyecolor"));
            description.setColor(rSet.getString("color"));
            description.setAge_range(rSet.getString("age"));
            description.setHair_color(rSet.getString("haircolor"));
            description.setDescriptionId(rSet.getString("description"));
        }
        return description;
    }

    public static Transportation getTransportation(String personid) throws SQLException {

        query = "select type, model, "
                + "description, color from transportation where personid = ? ";

        Transportation transportation = new Transportation();

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, personid);
        rSet = pState.executeQuery();
        while (rSet.next()) {
            transportation.setTrans_type(rSet.getString("type"));
            transportation.setDescription(rSet.getString("description"));
            transportation.setModel(rSet.getString("model"));
            transportation.setColor(rSet.getString("color"));

        }
        return transportation;
    }

    public static Description getFeature(String personid) throws SQLException {

        query = "select type, description from feature where personid = ? ";

        Description description = new Description();

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, personid);
        rSet = pState.executeQuery();
        while (rSet.next()) {

            description.setDistinctive_feature(rSet.getString("type"));
            description.setDescription_feature(rSet.getString("description"));
        }
        return description;
    }

    public static Location getLocation(String personid) throws SQLException {

        query = "select address, county, constituency, ward, "
                + "village from location where id = ? ";

        Location location = new Location();

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, personid);
        rSet = pState.executeQuery();
        while (rSet.next()) {
            location.setAddress(rSet.getString("address"));
            location.setConstituency(rSet.getString("constituency"));
            location.setCounty(rSet.getString("county"));
            location.setVillage(rSet.getString("village"));
            location.setWard(rSet.getString("ward"));

        }
        return location;
    }

    public static MissingPerson getMPerson(String personid) throws SQLException {

        query = "select fname, sname, ethnicity, lastcontact, "
                + "language, gender, idnumber from missingperson where personid = ? ";

        MissingPerson mPerson = new MissingPerson();

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, personid);
        rSet = pState.executeQuery();
        while (rSet.next()) {
            mPerson.setEthnicity(rSet.getString("ethnicity"));
            mPerson.setGender(rSet.getString("gender"));
            mPerson.setId_number(rSet.getString("idnumber"));
            mPerson.setLanguage(rSet.getString("language"));
            mPerson.setLast_contact(rSet.getString("lastcontact"));
            mPerson.setPerson_fname(rSet.getString("fname"));
            mPerson.setPerson_sname(rSet.getString("sname"));
        }
        return mPerson;
    }

    public static UnidentifiedPerson getUPerson(String personid) throws SQLException {

        query = "select fname, sname, ethnicity, datefound,"
                + "langauge , gender from unidentifiedperson where personid = ? ";

        UnidentifiedPerson uPerson = new UnidentifiedPerson();

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, personid);
        rSet = pState.executeQuery();
        while (rSet.next()) {
            uPerson.setEthnicity(rSet.getString("ethnicity"));
            uPerson.setGender(rSet.getString("gender"));

            uPerson.setLanguage(rSet.getString("langauge"));
            uPerson.setDateFound(rSet.getString("datefound"));
            uPerson.setPerson_fname(rSet.getString("fname"));
            uPerson.setPerson_sname(rSet.getString("sname"));
        }
        return uPerson;
    }

    public static ArrayList getCons(String county) throws SQLException {
        query = "select * from " + county;
        String constituency;
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
      
        rSet = pState.executeQuery();
        list = new ArrayList();
        while (rSet.next()) {
            constituency = rSet.getString("constituency");
            list.add(constituency);
        }
        return list;
    }

}
