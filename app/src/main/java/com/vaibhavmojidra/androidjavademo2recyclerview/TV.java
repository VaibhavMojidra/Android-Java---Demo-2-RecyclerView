package com.vaibhavmojidra.androidjavademo2recyclerview;

public class TV {
    private String name;
    private String company;

    public TV() {
        name="No Name";
        company="No Company Name";
    }

    public TV(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
