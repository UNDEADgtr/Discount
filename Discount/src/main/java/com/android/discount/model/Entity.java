package com.android.discount.model;

public class Entity implements java.io.Serializable {

    private String id;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    protected String throwIfEmpty(String s) {
        if (s == null || s.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        return s.trim();
    }
}
