/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Case;

public class Transportation {

    private String transportationId;
    private String trans_type;
    private String description;
    private String photo_path;
    private String model;
    private String color;
    private String make;

    public Transportation() {
    }

    public Transportation(String transportationId, String trans_type, String description, String photo_path, String model, String color, String make) {
        this.transportationId = transportationId;
        this.trans_type = trans_type;
        this.description = description;
        this.photo_path = photo_path;
        this.model = model;
        this.color = color;
        this.make = make;
    }
    

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getTransportationId() {
        return transportationId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransportationId(String transportationId) {
        this.transportationId = transportationId;
    }

    public String getTrans_type() {
        return trans_type;
    }

    public void setTrans_type(String trans_type) {
        this.trans_type = trans_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto_path() {
        return photo_path;
    }

    public void setPhoto_path(String photo_path) {
        this.photo_path = photo_path;
    }

}
