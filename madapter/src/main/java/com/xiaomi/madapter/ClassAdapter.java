package com.xiaomi.madapter;

/**
 * 设计模式：    适配器模式
 *
 * 定义：        将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能
 *               一起工作的那些类可以一起工作
 *
 * 应用场景： 1. 系统需要使用现有的类，而这些类的接口不符合系统的需要
 *            2. 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能
 *               在将来引进的类一起工作.
 *            3. 需要一个统一的输出接口，而输入端的类型不可预知.
 *
 * 优点：     1. 将目标类和适配者类解耦
 *            2. 增加了类的透明性和复用性，将具体的实现封装在适配者类中，
 *               对于客户端类来说是透明的，而且提高了适配者的复用性
 *            3. 灵活性和扩展性都非常好，符合开闭原则
 *            4. 允许状态转换逻辑与状态对象合成一体，而不是某一个巨大的条件语句块。
 *            5. 可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数
 *
 * 缺点：     1. 类适配器的缺点 : 对于Java、C#等不支持多重继承的语言，一次最多只能适配一个适配者类，
 *               而且目标抽象类只能为接口，不能为类，其使用有一定的局限性，不能将一个适配者类和他的
 *               子类同时适配到目标接口
 *            2. 对象适配器的缺点 : 与类适配器模式相比，要想置换适配者类的方法就不容易
 */

public class ClassAdapter extends Adaptee implements Target{

    @Override
    public void request() {
        doRequest();
    }
}