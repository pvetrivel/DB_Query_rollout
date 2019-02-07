package com.tekion.query.db_query.DealerMaster;

import java.util.ArrayList;

public class DealerOperationSchedule {
private String dealerOperationScheduleID;
private String dealerOperationType;
private ArrayList<BusinessHours> businessHours;

    public DealerOperationSchedule(String dealerOperationScheduleID, String dealerOperationType, ArrayList<BusinessHours> businessHours) {
        this.dealerOperationScheduleID = dealerOperationScheduleID;
        this.dealerOperationType = dealerOperationType;
        this.businessHours = businessHours;
    }

    public DealerOperationSchedule() {
    }

    public String getDealerOperationScheduleID() {
        return dealerOperationScheduleID;
    }

    public void setDealerOperationScheduleID(String dealerOperationScheduleID) {
        this.dealerOperationScheduleID = dealerOperationScheduleID;
    }

    public String getDealerOperationType() {
        return dealerOperationType;
    }

    public void setDealerOperationType(String dealerOperationType) {
        this.dealerOperationType = dealerOperationType;
    }

    public ArrayList<BusinessHours> getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(ArrayList<BusinessHours> businessHours) {
        this.businessHours = businessHours;
    }
}
