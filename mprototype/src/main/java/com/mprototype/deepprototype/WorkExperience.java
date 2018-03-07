package com.mprototype.deepprototype;

/**
 * Created by admin on 2017/12/22.
 */

public class WorkExperience implements Cloneable{
    private String company;
    private String workDate;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public WorkExperience clone() {
        WorkExperience clone = null;
        try {
            clone = (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
