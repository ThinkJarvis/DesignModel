package com.mbuilder.androidBuilder;

/**
 * Created by admin on 2017/12/27.
 */

public class Person {
    private String head;
    private String body;
    private String foot;

    private Person() {

    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getDes() {
        return getHead() + " | " + getBody() + " | " +  getFoot();
    }

    public static class Builder {
        private Person person;

        public Builder() {
            person = new Person();
        }

        public Builder setHead(String headDes) {
            person.setHead(headDes);
            return this;
        }

        public Builder setBody(String bodyDes) {
            person.setBody(bodyDes);
            return this;
        }

        public Builder setFoot(String footDes) {
            person.setFoot(footDes);
            return this;
        }

        public Person create() {
            return person;
        }
    }
}
