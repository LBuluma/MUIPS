/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import Case.Case;
import Case.Description;
import data.CaseDAO;
import data.DataRetrievalWrapper;
import data.UserDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import user.User;

/**
 *
 * @author justus
 */
public class TestLogin {

    public static void main(String[] args) throws SQLException {
        String desc = DataRetrievalWrapper.getPath("UP-43A741-19", "unidentified");
        System.out.println(desc);
            
        

    }

}
