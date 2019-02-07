package com.tekion.query.db_query.DealerMaster;

import java.util.ArrayList;

public class Features {
    private int id;
    private String name;
    private boolean is_enabled;
    ArrayList<SubFeatures> subFeatures;

    public Features(int id, String name, boolean is_enabled, ArrayList<SubFeatures> subFeatures) {
        this.id = id;
        this.name = name;
        this.is_enabled = is_enabled;
        this.subFeatures = subFeatures;
    }

    public Features() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs_enabled() {
        return is_enabled;
    }

    public void setIs_enabled(boolean is_enabled) {
        this.is_enabled = is_enabled;
    }

    public ArrayList<SubFeatures> getSubFeatures() {
        return subFeatures;
    }

    public void setSubFeatures(ArrayList<SubFeatures> subFeatures) {
        this.subFeatures = subFeatures;
    }
}
