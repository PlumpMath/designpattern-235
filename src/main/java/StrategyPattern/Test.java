package StrategyPattern;

import StrategyPattern.Context.SimpleContext;
import StrategyPattern.DetailStrategy.DetailStrategyA;
import StrategyPattern.Strategy.Strategy;

/**
 * Created by Administrator on 2017/1/14.
 */
public class Test {

    public static void main(String [] argv) throws Throwable{
        Strategy strategy=new DetailStrategyA();
        SimpleContext simpleContext=new SimpleContext(strategy);
        simpleContext.action("Hello,world");
    }
}
