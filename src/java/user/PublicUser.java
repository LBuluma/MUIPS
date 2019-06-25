/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author justus
 */
public class PublicUser extends User {
    
    private String locationId;

    public PublicUser(String user_fname, String user_sname, String user_pass, String user_email, String user_phone, String user_id, String date_added, String user_role, String user_org) {
        super(user_fname, user_sname, user_pass, user_email, user_phone, user_id, date_added, user_role, user_org);
    }

   
   

   public PublicUser(){
       
   }

  

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
    
  
    
    
}
