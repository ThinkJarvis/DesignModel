package com.mstrategy;


public class StrategyFactory {

    private static StrategyFactory sStrategyFactory;

    public static synchronized StrategyFactory getInstance() {
        if (sStrategyFactory == null) {
            sStrategyFactory = new StrategyFactory();
        }
        return sStrategyFactory;
    }

    public IPriceStrategy chooseWhichStrategy(float price) {
        IPriceStrategy iPriceStrategy;
        if (price > 0 && price < 100) {
            iPriceStrategy = new HalfPriceStrategy();
        }else {
            iPriceStrategy = new FullCutStrategy();
        }
        return iPriceStrategy;
    }
}
