package com.mstaticfactory;

/**
 * 设计模式： 简单工厂
 *
 * 定义：     简单工厂模式（Simple Factory Pattern）属于类的创新型模式，又叫静态工厂方法模式（Static FactoryMethod Pattern）,
 *            是通过专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类
 *
 * 应用场景： 客户端实例化大量对象。
 *
 * 优点：     根据单一职责，简单工厂可以让客户端免去实例化大量对象的任务。帮助解耦
 * 缺点：     违背开放-封闭原则，当创建新的对象时，需要增加case，还是需要修改SimpleFactory类
 *
 * Factory 和 car 依赖关系  工厂依赖汽车。
 */

public class SimpleFactory {

    private static SimpleFactory sSimpleFactory;

    public static synchronized SimpleFactory getInstance() {
        if (sSimpleFactory == null) {
            sSimpleFactory = new SimpleFactory();
        }
        return sSimpleFactory;
    }

    public ISuperCar switchWhichCar(String name) {
        ISuperCar superCar = null;
        switch (name) {
            case "Koenigsegg":
                superCar = new Koenigsegg();
                break;

            case "Pagani":
                superCar = new Pagani();
                break;

            default:
                break;
        }

        return superCar;
    }
}
