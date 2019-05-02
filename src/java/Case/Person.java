/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Case;

public class Person {

    
    private String person_fname;
    private String person_sname;
    private String personId;
    private String ethnicity;
    private String gender;
    private String added_by;
    private String language;
    
    //Constructor

    public Person(String person_fname, String person_sname, String personId, String ethnicity, String gender, String added_by, String language) {
        this.person_fname = person_fname;
        this.person_sname = person_sname;
        this.personId = personId;
        this.ethnicity = ethnicity;
        this.gender = gender;
        this.added_by = added_by;
        this.language = language;
    }
   
    
    //Empty constructor
    public Person() {
    }

    
    //Getters and setters
    public String getAdded_by() {
        return added_by;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPerson_fname() {
        return person_fname;
    }

    public void setPerson_fname(String person_fname) {
        this.person_fname = person_fname;
    }

    public String getPerson_sname() {
        return person_sname;
    }

    public void setPerson_sname(String person_sname) {
        this.person_sname = person_sname;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAdded_by(String added_by) {
        this.added_by = added_by;
    }

 

}
