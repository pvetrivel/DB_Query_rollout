package com.tekion.query.db_query.DealerMaster;

public class BusinessHours {
    private String openingTime;
    private String closingTime;

    public BusinessHours(String openingTime, String closingTime) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public BusinessHours() {
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }
}
