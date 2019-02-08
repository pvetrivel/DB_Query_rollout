package com.tekion.query.db_query.DealerMaster;

public class DealerLogos {
   private double width;
   private double height;
   private String title;
   private String imageID;

    public DealerLogos(double width, double height, String title, String imageID) {
        this.width = width;
        this.height = height;
        this.title = title;
        this.imageID = imageID;
    }

    public DealerLogos() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }
}
