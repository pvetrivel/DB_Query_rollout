package com.tekion.query.db_query.DealerMaster;

public class DealerAddress {
    private String dealerAddressID;
    private double addressType;
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String county;
    private String isActive;
    private String locationUrl;
    private String isdCode;

    public DealerAddress(String dealerAddressID, double addressType, String streetAddress1, String streetAddress2, String city, String state, String zipCode, String country, String county, String isActive, String locationUrl, String isdCode) {
        this.dealerAddressID = dealerAddressID;
        this.addressType = addressType;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.county = county;
        this.isActive = isActive;
        this.locationUrl = locationUrl;
        this.isdCode = isdCode;
    }

    public DealerAddress() {
    }

    public String getDealerAddressID() {
        return dealerAddressID;
    }

    public void setDealerAddressID(String dealerAddressID) {
        this.dealerAddressID = dealerAddressID;
    }

    public double getAddressType() {
        return addressType;
    }

    public void setAddressType(double addressType) {
        this.addressType = addressType;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getLocationUrl() {
        return locationUrl;
    }

    public void setLocationUrl(String locationUrl) {
        this.locationUrl = locationUrl;
    }

    public String getIsdCode() {
        return isdCode;
    }

    public void setIsdCode(String isdCode) {
        this.isdCode = isdCode;
    }
}
