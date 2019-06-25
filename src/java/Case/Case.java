/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Case;

public class Case extends Person {

    private String case_id;
    private String case_type;
    private String case_status;

    private String case_reporter;
    private String dateadded;
    private String OB;
    private String invest_agency;

    public Case(String case_id, String case_type, String case_status, String case_reporter, String dateadded, String OB, String invest_agency, String person_fname, String person_sname, String personId, String ethnicity, String gender, String added_by, String language) {
        super(person_fname, person_sname, personId, ethnicity, gender, added_by, language);
        this.case_id = case_id;
        this.case_type = case_type;
        this.case_status = case_status;
        this.case_reporter = case_reporter;
        this.dateadded = dateadded;
        this.OB = OB;
        this.invest_agency = invest_agency;
    }


    public Case() {
    }

    public String getInvest_agency() {
        return invest_agency;
    }

    public void setInvest_agency(String invest_agency) {
        this.invest_agency = invest_agency;
    }

    public String getOB() {
        return OB;
    }

    public void setOB(String OB) {
        this.OB = OB;
    }

    public String getCase_id() {
        return case_id;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }

    public String getCase_type() {
        return case_type;
    }

    public void setCase_type(String case_type) {
        this.case_type = case_type;
    }

    public String getCase_status() {
        return case_status;
    }

    public void setCase_status(String case_status) {
        this.case_status = case_status;
    }



    public String getCase_reporter() {
        return case_reporter;
    }

    public void setCase_reporter(String case_reporter) {
        this.case_reporter = case_reporter;
    }

    public String getDateadded() {
        return dateadded;
    }

    public void setDateadded(String dateadded) {
        this.dateadded = dateadded;
    }

}
