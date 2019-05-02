/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Case;

public class Description {

    private String weight;
    private String height;
    private String eye_color;
    private String distinctive_feature;
    private String description_feature;
    private String hair_color;
    private String age_range;
    private String descriptionId;
    private String personId;
    private String person_desc;
    private String color;

    //Constructor

    public Description(String weight, String height, String eye_color, String distinctive_feature,
            String description_feature, String hair_color, String age_range, String descriptionId, 
            String personId, String person_desc, String color) {
        this.weight = weight;
        this.height = height;
        this.eye_color = eye_color;
        this.distinctive_feature = distinctive_feature;
        this.description_feature = description_feature;
        this.hair_color = hair_color;
        this.age_range = age_range;
        this.descriptionId = descriptionId;
        this.personId = personId;
        this.person_desc = person_desc;
        this.color = color;
    }
   

    //Empty constructor
    public Description() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

    //Getters and setters
    public String getPerson_desc() {
        return person_desc;
    }

    public void setPerson_desc(String person_desc) {
        this.person_desc = person_desc;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getDistinctive_feature() {
        return distinctive_feature;
    }

    public void setDistinctive_feature(String distinctive_feature) {
        this.distinctive_feature = distinctive_feature;
    }

    public String getDescription_feature() {
        return description_feature;
    }

    public void setDescription_feature(String description_feature) {
        this.description_feature = description_feature;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getAge_range() {
        return age_range;
    }

    public void setAge_range(String age_range) {
        this.age_range = age_range;
    }

    public String getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(String descriptionId) {
        this.descriptionId = descriptionId;
    }

}
