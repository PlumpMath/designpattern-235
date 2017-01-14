package FactoryMethodPattern.FactoryMethodPattern;

import FactoryMethodPattern.FactoryMethodPattern.abstractFactory.ICarFactory;
import FactoryMethodPattern.FactoryMethodPattern.detailFactory.BenzCarFactory;
import FactoryMethodPattern.car.abstractProduct.ICar;

/**
 * Created by Administrator on 2017/1/10.
 */
public class Test {

    public static void main() throws Throwable{
        ICarFactory carFactory=new BenzCarFactory();
        ICar car=carFactory.createCar();
        car.drive();
    }
}
