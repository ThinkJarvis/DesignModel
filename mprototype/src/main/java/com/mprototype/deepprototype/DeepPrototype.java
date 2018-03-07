package com.mprototype.deepprototype;

import android.util.Log;

/**
 * Created by admin on 2017/12/22.
 */

public class DeepPrototype implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String company, String workDate) {
        workExperience.setCompany(company);
        workExperience.setWorkDate(workDate);
    }

    public DeepPrototype() {
        workExperience = new WorkExperience();
    }

    public void setPersonInfo(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void display() {
        Log.e("wjq","name = " + name + " sex = " + sex + " age = " + age + " company = " + workExperience.getCompany() + " workDate = " + workExperience.getWorkDate());
    }

    public DeepPrototype clone() {
        DeepPrototype clone = null;
        try {
            clone = (DeepPrototype) super.clone();
            clone.workExperience = workExperience.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
