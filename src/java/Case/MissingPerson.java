/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Case;

public class MissingPerson extends Person {

    private String last_contact;
    private String id_number;
    
    //Constructor

    public MissingPerson(String last_contact, String id_number, String person_fname,
            String person_sname, String personId, String ethnicity,
            String gender, String added_by, String language) {
        
        super(person_fname, person_sname, personId, ethnicity, gender, added_by, language);
        this.last_contact = last_contact;
        this.id_number = id_number;
    }
    
    
    //Empty constructor
    public MissingPerson() {
    }
    
    
    //Getter and setter methods
    public String getLast_contact() {
        return last_contact;
    }

    public void setLast_contact(String last_contact) {
        this.last_contact = last_contact;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

}
