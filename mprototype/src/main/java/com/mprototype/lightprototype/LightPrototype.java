package com.mprototype.lightprototype;

import android.util.Log;

/**
 * 设计模式： 原型模式
 *
 * 定义：     用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 *            Prototype原型模式是一种创建型设计模式，Prototype模式允许一个对象再创建另外一个可定制的对象，
 *            根本无需知道任何如何创建的细节,工作原理是:通过将一个原型对象传给那个要发动创建的对象，
 *            这个要发动创建的对象通过请求原型对象拷贝它们自己来实施创建
 *
 * 应用场景： 它主要面对的问题是：“某些结构复杂的对象”的创建工作；由于需求的变化，这些对象经常面临着剧烈的变化，
 *            但是他们却拥有比较稳定一致的接口
 *
 * 优点：     1、如果创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提高效率。
 *            2、可以使用深克隆保持对象的状态。
 *            3、原型模式提供了简化的创建结构。
 *
 * 缺点：     1、在实现深克隆的时候可能需要比较复杂的代码。
 *            2、需要为每一个类配备一个克隆方法，而且这个克隆方法需要对类的功能进行通盘考虑，
 *               这对全新的类来说不是很难，但对已有的类进行改造时，不一定是件容易的事，
 *               必须修改其源代码，违背了“开闭原则”。
 *
 */

public  class LightPrototype implements Cloneable{
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

    public LightPrototype() {
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

    public LightPrototype clone() {
        LightPrototype clone = null;
        try {
            clone = (LightPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

}
