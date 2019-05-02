/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import data.DataInsertionWrapper;
import data.DataRetrievalWrapper;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.UUID;

/**
 *
 * @author justus
 */
public class TestLogin {

    public static void main(String[] args) throws SQLException {
     int profile = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(profile); 
        System.out.println(profile - 2000);
        
        String hey = UUID.randomUUID().toString();
            System.out.println(hey);
        String h = hey.substring(0, 5);
         System.out.println(h.toUpperCase());
    }

   
}

