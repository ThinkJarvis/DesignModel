package com.mbuilder.javaBuilder;

/**
 * Created by admin on 2017/12/26.
 */

public class ManBuilder extends PersonBuilder {

    @Override
    public PersonBuilder buildHead() {
        person.setHead("男人的头");
        return this;
    }

    @Override
    public PersonBuilder buildBody() {
        person.setBody("男人的身体");
        return this;
    }

    @Override
    public PersonBuilder buildFoot() {
        person.setFoot("男人的脚");
        return this;
    }
}
