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
public class User {
    private String user_fname;
    private String user_sname;
    private String user_pass;
    private String user_email;
    private String user_phone;
    private String user_id;
    private String date_added;
    private String user_role;
    private String user_org;
    private String user_status;

    public User() {
    }

    public User(String user_fname, String user_sname, String user_pass, String user_email, String user_phone, String user_id, String date_added, String user_role, String user_org, String user_status) {
        this.user_fname = user_fname;
        this.user_sname = user_sname;
        this.user_pass = user_pass;
        this.user_email = user_email;
        this.user_phone = user_phone;
        this.user_id = user_id;
        this.date_added = date_added;
        this.user_role = user_role;
        this.user_org = user_org;
        this.user_status = user_status;
    }

    
    
    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

 
    

    public String getUser_org() {
        return user_org;
    }

    public void setUser_org(String user_org) {
        this.user_org = user_org;
    }

    
    

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

   
    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }
    
    
    

    public String getUser_sname() {
        return user_sname;
    }

    public void setUser_sname(String user_sname) {
        this.user_sname = user_sname;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_fname() {
        return user_fname;
    }

    public void setUser_fname(String user_name) {
        this.user_fname = user_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    
    
}
