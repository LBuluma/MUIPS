/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

public class Staff extends User {

    private String staff_type;
    private String staff_Id;
    private String org_id;
    private String addedby;

    public Staff(String staff_type, String staff_Id, String org_id, String addedby, String user_fname, String user_sname, String user_pass, String user_email, String user_phone, String user_id, String date_added) {
        super(user_fname, user_sname, user_pass, user_email, user_phone, user_id, date_added);
        this.staff_type = staff_type;
        this.staff_Id = staff_Id;
        this.org_id = org_id;
        this.addedby = addedby;
    }

    public String getStaff_type() {
        return staff_type;
    }

    public void setStaff_type(String staff_type) {
        this.staff_type = staff_type;
    }

    public String getStaff_Id() {
        return staff_Id;
    }

    public void setStaff_Id(String staff_Id) {
        this.staff_Id = staff_Id;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getAddedby() {
        return addedby;
    }

    public void setAddedby(String addedby) {
        this.addedby = addedby;
    }

}
