package com.mstrategy;

/**
 * 设计模式： 策略模式
 * 定义：     策略模式是指对一系列的算法定义，并将每一个算法封装起来，而且使它们还可以相互替换。
 *            策略模式让算法独立于使用它的客户而独立变化。
 *
 * 应用场景： 1. 多个类只区别在表现行为不同，可以使用Strategy模式，在运行时动态选择具体要执行的行为。
 *            2. 需要在不同情况下使用不同的策略(算法)，或者策略还可能在未来用其它方式来实现。
 *            3. 对客户隐藏具体策略(算法)的实现细节，彼此完全独立。
 *
 * 优点：     1.使用继承可以把公共的代码转移到父类里面，从而避免重复的代码
 *            2.算法和业务分离
 * 缺点：     违背开放-封闭原则，当创建新的对象时，需要增加case，还是需要修改SimpleFactory类
 *
 * IPriceStrategy 和 PurchaseStrategy 聚合关系  PurchaseStrategy 可以包含IPriceStrategy，
 * 但是可以包含IPriceStrategy不是PurchaseStrategy的一部分
 */

public class PurchaseStrategy {

    private IPriceStrategy mIPriceStrategy;

    public PurchaseStrategy(IPriceStrategy iPriceStrategy) {
        mIPriceStrategy = iPriceStrategy;
    }

    public float countPrice(float price) {
        if (null != mIPriceStrategy)
            return mIPriceStrategy.getPrice(price);
        else
            return price;
    }
}
