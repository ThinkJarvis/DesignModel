package com.mbuilder.javaBuilder;

/**
 * Created by admin on 2017/12/26.
 */

public class BuilderDirector {

    public Person Construct(PersonBuilder personBuilder) {
        return personBuilder.buildHead().buildBody().buildFoot().create();
    }
}
