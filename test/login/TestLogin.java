/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import Case.Case;
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
        int list  = DataRetrievalWrapper.getOrgId("MP-C9930A-19");
        System.out.println(list);

    }

}
