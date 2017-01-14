package StrategyPattern.Context;

import StrategyPattern.Strategy.Strategy;

/**
 * Created by Administrator on 2017/1/14.
 */
public class SimpleContext {

    private  Strategy strategy;

    public SimpleContext(Strategy strategy){
        this.strategy=strategy;
    }


    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void action(String input){
        strategy.strategy(input);
    }
}
