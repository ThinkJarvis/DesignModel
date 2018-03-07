package com.xiaomi.mmemento;

/**
 * Created by admin on 2018/2/14.
 */

public abstract class BaseInfo {
    protected String state;
    protected int status;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
