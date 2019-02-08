package com.tekion.query.db_query.DealerMaster;

public class SubFeatures {
    private int id;
    private String name;
    private String is_enabled;

    public SubFeatures(int id, String name, String is_enabled) {
        this.id = id;
        this.name = name;
        this.is_enabled = is_enabled;
    }

    public SubFeatures() {
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

    public String getIs_enabled() {
        return is_enabled;
    }

    public void setIs_enabled(String is_enabled) {
        this.is_enabled = is_enabled;
    }
}
