/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Case;

public class UnidentifiedPerson extends Person {
    private String dateFound;

    public UnidentifiedPerson(String person_fname, String person_sname, String personId, String ethnicity, String gender, String added_by, String language) {
        super(person_fname, person_sname, personId, ethnicity, gender, added_by, language);
    }

   

    public UnidentifiedPerson() {
      
    }

    public String getDateFound() {
        return dateFound;
    }

    public void setDateFound(String dateFound) {
        this.dateFound = dateFound;
    }
    
    


 



    
}
