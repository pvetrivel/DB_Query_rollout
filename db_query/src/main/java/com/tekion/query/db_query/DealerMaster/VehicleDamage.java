package com.tekion.query.db_query.DealerMaster;

public class VehicleDamage {

  private String  vehicleDamageID;
  private String imageURL;
  private String damageType;
  private String description;
  private double priority;
  private String icon;

    public VehicleDamage(String vehicleDamageID, String imageURL, String damageType, String description, double priority, String icon) {
        this.vehicleDamageID = vehicleDamageID;
        this.imageURL = imageURL;
        this.damageType = damageType;
        this.description = description;
        this.priority = priority;
        this.icon = icon;
    }

    public VehicleDamage() {
    }

    public String getVehicleDamageID() {
        return vehicleDamageID;
    }

    public void setVehicleDamageID(String vehicleDamageID) {
        this.vehicleDamageID = vehicleDamageID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriority() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
