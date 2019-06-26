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
import user.User;

public class DataRetrievalWrapper {

    static PreparedStatement pState;
    static ResultSet rSet;
    static String query;
    static Connection conn;
    static ArrayList list;

    public static User getProfile(String email) throws SQLException {
        list = new ArrayList();
        String locationId = null;
        query = "select * from publicuser where email= ? ";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        User usr = null;
        pState.setString(1, email);
        rSet = pState.executeQuery();
        while (rSet.next()) {
            usr = new User();
            usr.setUser_email(rSet.getString("email"));
            usr.setUser_fname(rSet.getString("fname"));
            usr.setUser_sname(rSet.getString("sname"));
            usr.setUser_phone(rSet.getString("phone"));
            usr.setUser_id(rSet.getString("id"));

        }
        System.out.println("Profile Gotten");

        return usr;
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
            description.setWeight(rSet.getInt("weight"));
            description.setHeight(rSet.getInt("height"));
            description.setEye_color(rSet.getString("eyecolor"));
            description.setColor(rSet.getString("color"));
            description.setAge_range(rSet.getString("age"));
            description.setHair_color(rSet.getString("haircolor"));
            description.setPerson_desc(rSet.getString("description"));
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
            //transportation.setMake(rSet.getString("make"));
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

        query = "select fname, sname, ethicity, datefound,"
                + "langauge , gender from unidentifiedperson where personid = ? ";

        UnidentifiedPerson uPerson = new UnidentifiedPerson();

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, personid);
        rSet = pState.executeQuery();
        while (rSet.next()) {
            uPerson.setEthnicity(rSet.getString("ethicity"));
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

    public static String getPath(String id) throws SQLException {
        query = "select path from file where personid = ?";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        String path = null;
        pState.setString(1, id);
        rSet = pState.executeQuery();

        while (rSet.next()) {
            path = rSet.getString("path");

        }
        System.out.println(path);
        return path;
    }

    public static Organization fetchOrg(String name) throws SQLException {
        Organization org = new Organization();

        query = "select * from station where name = ?";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, name);
        rSet = pState.executeQuery();
        while (rSet.next()) {
            org.setAddress(rSet.getString("address"));
            org.setConstituency(rSet.getString("constituency"));
            org.setCounty(rSet.getString("county"));
            org.setEmail(rSet.getString("email"));
            org.setName(rSet.getString("name"));
            org.setTelephone(rSet.getString("phone"));
            org.setWard(rSet.getString("ward"));

        }
        return org;
    }

    public static ArrayList getOrgs() throws SQLException {

        Organization org;
        query = "select * from station ";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        list = new ArrayList();
        rSet = pState.executeQuery();
        while (rSet.next()) {
            org = new Organization();
           
            org.setName(rSet.getString("name"));
            list.add(org);
        }
        return list;
    }

    public static String getOrgId(String caseid) throws SQLException {

      
        query = "select org from cases where personid = ? ";

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, caseid);
        String id = null;
        rSet = pState.executeQuery();
        while (rSet.next()) {
           id = rSet.getString("org");
        }
        return id ;
    }

}
