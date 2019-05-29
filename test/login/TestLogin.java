/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import Case.Description;
import Case.MissingPerson;
import Case.Transportation;
import Case.UnidentifiedPerson;
import Location.Location;
import data.CaseDAO;
import data.DataRetrievalWrapper;
import data.UserDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author justus
 */
public class TestLogin {

    public static void main(String[] args) throws SQLException {
        CaseDAO.saveImage("missing",  "MP-FBB4E3-19", "/home/justus/NetBeansProjects/MUIPS/build/web/uploads/Screenshot from 2019-04-16 16-19-52.png");
        
    
    }

}
