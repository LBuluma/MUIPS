/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import Case.Case;
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
        } else if (role.equals("prof")) {
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
        pState.setString(1, "Resolved");
        pState.setString(2, personid);
        pState.executeUpdate();
        System.out.println("Case closed successfully");
    }

    public static ArrayList<Case> retrieveCases(String type) throws SQLException {
        String contact = null;

        if ("missing".equals(type)) {
            query = "SELECT status, cases.personid,org, fname, sname, lastcontact, gender, idnumber FROM cases"
                    + " INNER JOIN missingperson ON cases.personid = missingperson.personid ";
            contact = "lastcontact";

        } else if ("unidentified".equals(type)) {
            query = "SELECT status, cases.personid,org, fname, sname, datefound, gender FROM cases"
                    + " INNER JOIN  unidentifiedperson ON cases.personid = unidentifiedperson.personid ";
            contact = "datefound";
            ;
        }
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);

        rSet = pState.executeQuery();
        ArrayList<Case> list = new ArrayList();
        Case c;

        while (rSet.next()) {
            c = new Case();

            c.setCase_id(rSet.getString("personid"));
            c.setCase_status(rSet.getString("status").toUpperCase());
            c.setDateadded(rSet.getString(contact));

            if (type.equals("missing")) {
                c.setCase_reporter(rSet.getString("idnumber"));
            }
            c.setGender(rSet.getString("gender"));
            c.setDateadded(rSet.getString(contact));
            c.setPerson_fname(rSet.getString("fname"));
            c.setPerson_sname(rSet.getString("sname"));
            c.setInvest_agency(rSet.getString("org").toUpperCase());
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

    public static int countCaseType(String type, String status, String start, String stop) throws SQLException {
        query = "select count(*) from cases where type = ? and status = ? and date between ? and ?";
        int x = 0;
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, type);
        pState.setString(2, status);
        pState.setString(3, start);
        pState.setString(4, stop);
        rSet = pState.executeQuery();

        while (rSet.next()) {
            x = rSet.getInt(1);
        }
        return x;
    }

    public static int conCases(String constituency, String type, String status, String start, String stop) throws SQLException {
        query = "SELECT count(*) FROM cases"
                + ",location where cases.personid = location.id and location.constituency = ? "
                + "and cases.type = ? and cases.status=? and date between ? and ?";

        int x = 0;
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, constituency);
        pState.setString(2, type);
        pState.setString(3, status);
        pState.setString(4, start);
        pState.setString(5, stop);
        rSet = pState.executeQuery();

        while (rSet.next()) {
            x = rSet.getInt(1);
        }
        return x;
    }

    public static ArrayList searchMCase(Location loc, MissingPerson person,
            Description desc, int minAge, int maxAge, int maxH, int minH, int minW, int maxW) throws SQLException {
        //Location information
        String con = loc.getConstituency();
        //Description information
        String color = desc.getColor();
        String feature = desc.getDistinctive_feature();
        //Missingperson information
        String ethnic = person.getEthnicity();
        String gender = person.getGender();
        String fname = person.getPerson_fname();
        String sname = person.getPerson_sname();

        query = "SELECT  cases.personid, cases.status, cases.org, missingperson.fname, missingperson.sname, missingperson.lastcontact, missingperson.gender, missingperson.idnumber FROM "
                + "  feature,description, cases INNER JOIN missingperson ON cases.personid = missingperson.personid"
                + " INNER JOIN location on location.id = cases.personid where location.constituency = ?  and"
                + "  description.color=? and "
                + "missingperson.fname=? and  missingperson.sname=? and  missingperson.gender=? and missingperson.ethnicity =?"
                + "and feature.type= ? "
                + "and description.height  > ? and description.height < ? and description.weight  > ? and description.weight < ? and"
                + " description.age > ? and description.age <  ? and cases.type=? GROUP BY   cases.personid, cases.status, cases.org, missingperson.fname, missingperson.sname, missingperson.lastcontact, missingperson.gender, missingperson.idnumber ";

        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, con);

        pState.setString(2, color);

        pState.setString(3, fname);
        pState.setString(4, sname);

        pState.setString(5, gender);
        pState.setString(6, ethnic);
        pState.setString(7, feature);
        pState.setInt(8, minH);
        pState.setInt(9, maxH);
        pState.setInt(10, minW);
        pState.setInt(11, maxW);
        pState.setInt(12, minAge);
        pState.setInt(13, maxAge);
        pState.setString(14, "missing");
        rSet = pState.executeQuery();
        list = new ArrayList();
        Case c;
        while (rSet.next()) {
            c = new Case();
            System.out.println("class" + c.getCase_id());
            c.setCase_id(rSet.getString("personid"));
            c.setCase_status(rSet.getString("status"));
            c.setInvest_agency(rSet.getString("org"));
            c.setCase_reporter(rSet.getString("idnumber"));
            c.setGender(rSet.getString("gender"));
            c.setDateadded(rSet.getString("lastContact"));
            c.setPerson_fname(rSet.getString("fname"));
            c.setPerson_sname(rSet.getString("sname"));
            System.out.println("class" + c.getCase_id());
            list.add(c);

        }

        return list;

    }

    public static ArrayList searchUCase(Location loc,
            UnidentifiedPerson person, Description desc, int minAge, int maxAge, int maxH, int minH, int minW, int maxW) throws SQLException {
        //Location information
        String con = loc.getConstituency();

        //Description information
        String color = desc.getColor();

        String feature = desc.getDistinctive_feature();

        //unidentifiedperson information
        String ethnic = person.getEthnicity();
        String gender = person.getGender();
        String lang = person.getLanguage();
        String fname = person.getPerson_fname();
        String sname = person.getPerson_sname();
        query = "SELECT  cases.personid, cases.status, cases.org, unidentifiedperson.fname, unidentifiedperson.sname, unidentifiedperson.datefound, unidentifiedperson.gender FROM "
                + "  feature,description, cases INNER JOIN unidentifiedperson ON cases.personid = unidentifiedperson.personid"
                + " INNER JOIN location on location.id = cases.personid where location.constituency = ?  and"
                + "  description.color=? and "
                + "unidentifiedperson.fname=? and  unidentifiedperson.sname=? and  unidentifiedperson.gender=? and unidentifiedperson.ethicity =?"
                + "and feature.type= ? "
                + "and description.height  > ? and description.height < ? and description.weight  > ? and description.weight < ? and"
                + " description.age > ? and description.age <  ? and cases.type=? GROUP BY   cases.personid, cases.status, cases.org, unidentifiedperson.fname, unidentifiedperson.sname,"
                + " unidentifiedperson.datefound, unidentifiedperson.gender";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, con);
        pState.setString(2, color);

        pState.setString(3, fname);
        pState.setString(4, sname);

        pState.setString(5, gender);
        pState.setString(6, ethnic);
        pState.setString(7, feature);
        pState.setInt(8, minH);
        pState.setInt(9, maxH);
        pState.setInt(10, minW);
        pState.setInt(11, maxW);
        pState.setInt(12, minAge);
        pState.setInt(13, maxAge);
        pState.setString(14, "unidentified");
        rSet = pState.executeQuery();
        list = new ArrayList();
        Case c;
        while (rSet.next()) {
            c = new Case();

            c.setCase_id(rSet.getString("personid"));
            c.setCase_status(rSet.getString("status"));
            c.setInvest_agency(rSet.getString("org"));

            c.setGender(rSet.getString("gender"));
            c.setDateadded(rSet.getString("datefound"));
            c.setPerson_fname(rSet.getString("fname"));
            c.setPerson_sname(rSet.getString("sname"));
            list.add(c);

        }

        return list;

    }

    public static ArrayList generateSummary(String type2, String status2, String start, String end) throws SQLException {

        String cons[] = {"Subukia", "Nakuru Town West", "Nakuru Town", "Nakuru Town East", "Kuresoi North", "Kuresoi South", "Rongai", " Molo"};
        String type[] = {type2};
        String status[] = {status2};
        int x;
        list = new ArrayList();
        Case c;
        for (String con : cons) {
            for (String type1 : type) {
                for (String status1 : status) {
                    c = new Case();
                    x = CaseDAO.conCases(con, type1, status1, start, end);
                    c.setCase_reporter(con);
                    c.setCase_type(type1);
                    c.setCase_status(status1);
                    c.setCase_stat(x);
                    list.add(c);
                }
            }
        }
        return list;

    }

    public static ArrayList getStationPosts(String station) throws SQLException {

        query = "SELECT status, cases.personid,org, fname, sname, lastcontact, gender, idnumber FROM cases"
                + " INNER JOIN missingperson ON cases.personid = missingperson.personid  where cases.org = ? and cases.type= ? ";
        conn = DatabaseConnection.getConnection();
        pState = conn.prepareStatement(query);
        pState.setString(1, station);
        pState.setString(2, "missing");
        rSet = pState.executeQuery();
        System.out.println(rSet);
        list = new ArrayList();
        Case c;

        while (rSet.next()) {
            c = new Case();

            c.setCase_id(rSet.getString("personid"));
            c.setCase_status(rSet.getString("status").toUpperCase());
            c.setDateadded(rSet.getString("lastcontact"));
            c.setCase_reporter(rSet.getString("idnumber"));
            c.setGender(rSet.getString("gender"));
            c.setPerson_fname(rSet.getString("fname"));
            c.setPerson_sname(rSet.getString("sname"));
            c.setInvest_agency(rSet.getString("org").toUpperCase());
            list.add(c);
        }
        System.out.println("case gotten successfully");
        return list;
    }

}
