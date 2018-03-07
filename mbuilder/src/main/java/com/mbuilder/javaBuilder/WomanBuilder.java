package com.mbuilder.javaBuilder;

/**
 * Created by admin on 2017/12/26.
 */

public class WomanBuilder extends PersonBuilder {

    @Override
    public PersonBuilder buildHead() {
        person.setHead("女人的头");
        return this;
    }

    @Override
    public PersonBuilder buildBody() {
        person.setBody("女人的身体");
        return this;
    }

    @Override
    public PersonBuilder buildFoot() {
        person.setFoot("女人的脚");
        return this;
    }
}
