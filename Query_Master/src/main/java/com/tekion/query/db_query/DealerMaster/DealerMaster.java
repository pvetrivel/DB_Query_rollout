package com.tekion.query.db_query.DealerMaster;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Document(collection = "DealerMaster")
public class DealerMaster {

    private String _id;
    private String dealerName;
    private String[] makeCode;
    private String dealerDisplayName;
    private String stateIssuedNumbe;
    private String manufacturerIssuedNumber;
    private String tenantID;
    private String website;
    private String phone;
    private ArrayList<VehicleDamage> vehicleDamage;
    private  String timeZone;
    private String currency;
    private String dealershipCode;
    private String[] dealerGroup;
    private ArrayList<DealerAddress> dealerAddress;
    private ArrayList<DealerLogos> dealerLogos;
    private ArrayList<DealerOperationSchedule> dealerOperationSchedule;
    private String[] dealerContact;
    private boolean isActive;
    private String lastUpdatedByUser;
    private String lastUpdatedByDisplayName;
    private Date createDateTime; //ISODate("2018-10-18T07:31:45Z")
	private Date lastUpdatedDateTime;
	private String documentVersion;
	private String dealerDoingBusinessAsName;
	private String applicationCode;
	private double lateAppointmentMins;
	private double missedAppointmentMins;
	private String defaultOperationCodePosition;
	private String DMSIntegration;
	private ArrayList<Features> features;

    public DealerMaster(String _id, String dealerName, String[] makeCode, String dealerDisplayName, String stateIssuedNumbe, String manufacturerIssuedNumber, String tenantID, String website, String phone, ArrayList<VehicleDamage> vehicleDamage, String timeZone, String currency, String dealershipCode, String[] dealerGroup, ArrayList<DealerAddress> dealerAddress, ArrayList<DealerLogos> dealerLogos, ArrayList<DealerOperationSchedule> dealerOperationSchedule, String[] dealerContact, boolean isActive, String lastUpdatedByUser, String lastUpdatedByDisplayName, String documentVersion, String dealerDoingBusinessAsName, String applicationCode, double lateAppointmentMins, double missedAppointmentMins, String defaultOperationCodePosition, String DMSIntegration, ArrayList<Features> features) {
        this._id = _id;
        this.dealerName = dealerName;
        this.makeCode = makeCode;
        this.dealerDisplayName = dealerDisplayName;
        this.stateIssuedNumbe = stateIssuedNumbe;
        this.manufacturerIssuedNumber = manufacturerIssuedNumber;
        this.tenantID = tenantID;
        this.website = website;
        this.phone = phone;
        this.vehicleDamage = vehicleDamage;
        this.timeZone = timeZone;
        this.currency = currency;
        this.dealershipCode = dealershipCode;
        this.dealerGroup = dealerGroup;
        this.dealerAddress = dealerAddress;
        this.dealerLogos = dealerLogos;
        this.dealerOperationSchedule = dealerOperationSchedule;
        this.dealerContact = dealerContact;
        this.isActive = isActive;
        this.lastUpdatedByUser = lastUpdatedByUser;
        this.lastUpdatedByDisplayName = lastUpdatedByDisplayName;
        this.createDateTime = new Date();
        this.lastUpdatedDateTime = new Date();
        this.documentVersion = documentVersion;
        this.dealerDoingBusinessAsName = dealerDoingBusinessAsName;
        this.applicationCode = applicationCode;
        this.lateAppointmentMins = lateAppointmentMins;
        this.missedAppointmentMins = missedAppointmentMins;
        this.defaultOperationCodePosition = defaultOperationCodePosition;
        this.DMSIntegration = DMSIntegration;
        this.features = features;
    }

    public DealerMaster() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String[] getMakeCode() {
        return makeCode;
    }

    public void setMakeCode(String[] makeCode) {
        this.makeCode = makeCode;
    }

    public String getDealerDisplayName() {
        return dealerDisplayName;
    }

    public void setDealerDisplayName(String dealerDisplayName) {
        this.dealerDisplayName = dealerDisplayName;
    }

    public String getStateIssuedNumbe() {
        return stateIssuedNumbe;
    }

    public void setStateIssuedNumbe(String stateIssuedNumbe) {
        this.stateIssuedNumbe = stateIssuedNumbe;
    }

    public String getManufacturerIssuedNumber() {
        return manufacturerIssuedNumber;
    }

    public void setManufacturerIssuedNumber(String manufacturerIssuedNumber) {
        this.manufacturerIssuedNumber = manufacturerIssuedNumber;
    }

    public String getTenantID() {
        return tenantID;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<VehicleDamage> getVehicleDamage() {
        return vehicleDamage;
    }

    public void setVehicleDamage(ArrayList<VehicleDamage> vehicleDamage) {
        this.vehicleDamage = vehicleDamage;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDealershipCode() {
        return dealershipCode;
    }

    public void setDealershipCode(String dealershipCode) {
        this.dealershipCode = dealershipCode;
    }

    public String[] getDealerGroup() {
        return dealerGroup;
    }

    public void setDealerGroup(String[] dealerGroup) {
        this.dealerGroup = dealerGroup;
    }

    public ArrayList<DealerAddress> getDealerAddress() {
        return dealerAddress;
    }

    public void setDealerAddress(ArrayList<DealerAddress> dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    public ArrayList<DealerLogos> getDealerLogos() {
        return dealerLogos;
    }

    public void setDealerLogos(ArrayList<DealerLogos> dealerLogos) {
        this.dealerLogos = dealerLogos;
    }

    public ArrayList<DealerOperationSchedule> getDealerOperationSchedule() {
        return dealerOperationSchedule;
    }

    public void setDealerOperationSchedule(ArrayList<DealerOperationSchedule> dealerOperationSchedule) {
        this.dealerOperationSchedule = dealerOperationSchedule;
    }

    public String[] getDealerContact() {
        return dealerContact;
    }

    public void setDealerContact(String[] dealerContact) {
        this.dealerContact = dealerContact;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getLastUpdatedByUser() {
        return lastUpdatedByUser;
    }

    public void setLastUpdatedByUser(String lastUpdatedByUser) {
        this.lastUpdatedByUser = lastUpdatedByUser;
    }

    public String getLastUpdatedByDisplayName() {
        return lastUpdatedByDisplayName;
    }

    public void setLastUpdatedByDisplayName(String lastUpdatedByDisplayName) {
        this.lastUpdatedByDisplayName = lastUpdatedByDisplayName;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    public void setLastUpdatedDateTime(Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    public String getDocumentVersion() {
        return documentVersion;
    }

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    public String getDealerDoingBusinessAsName() {
        return dealerDoingBusinessAsName;
    }

    public void setDealerDoingBusinessAsName(String dealerDoingBusinessAsName) {
        this.dealerDoingBusinessAsName = dealerDoingBusinessAsName;
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    public double getLateAppointmentMins() {
        return lateAppointmentMins;
    }

    public void setLateAppointmentMins(double lateAppointmentMins) {
        this.lateAppointmentMins = lateAppointmentMins;
    }

    public double getMissedAppointmentMins() {
        return missedAppointmentMins;
    }

    public void setMissedAppointmentMins(double missedAppointmentMins) {
        this.missedAppointmentMins = missedAppointmentMins;
    }

    public String getDefaultOperationCodePosition() {
        return defaultOperationCodePosition;
    }

    public void setDefaultOperationCodePosition(String defaultOperationCodePosition) {
        this.defaultOperationCodePosition = defaultOperationCodePosition;
    }

    public String getDMSIntegration() {
        return DMSIntegration;
    }

    public void setDMSIntegration(String DMSIntegration) {
        this.DMSIntegration = DMSIntegration;
    }

    public ArrayList<Features> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Features> features) {
        this.features = features;
    }

    public void applyToExist(DealerMaster dm){
        dm.set_id(_id);
       dm.setDealerName(dealerName);
       dm.setMakeCode(makeCode);
       dm.setDealerDisplayName(dealerDisplayName);
       dm.setStateIssuedNumbe(stateIssuedNumbe);
       dm.setManufacturerIssuedNumber(manufacturerIssuedNumber);
       dm.setTenantID(tenantID);
       dm.setWebsite(website);
       dm.setPhone(phone);
       dm.setVehicleDamage(vehicleDamage);
       dm.setTimeZone(timeZone);
       dm.setCurrency(currency);
       dm.setDealershipCode(dealershipCode);
       dm.setDealerGroup(dealerGroup);
       dm.setDealerAddress(dealerAddress);
       dm.setDealerLogos(dealerLogos);
        dm.setDealerOperationSchedule(dealerOperationSchedule);
        dm.setDealerContact(dealerContact);
        dm.setActive(isActive);
        dm.setLastUpdatedByUser(lastUpdatedByUser);
        dm.setLastUpdatedByDisplayName(lastUpdatedByDisplayName);
        dm.setCreateDateTime(createDateTime);
        dm.setLastUpdatedDateTime(lastUpdatedDateTime);
        dm.setDocumentVersion(documentVersion);
        dm.setDealerDoingBusinessAsName(dealerDoingBusinessAsName);
        dm.setApplicationCode(applicationCode);
        dm.setLateAppointmentMins(lateAppointmentMins);
        dm.setMissedAppointmentMins(missedAppointmentMins);
        dm.setDefaultOperationCodePosition(defaultOperationCodePosition);
        dm.setDMSIntegration(DMSIntegration);
        dm.setFeatures(features);
    }
}
