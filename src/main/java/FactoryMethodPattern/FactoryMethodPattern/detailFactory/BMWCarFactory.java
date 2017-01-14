package FactoryMethodPattern.FactoryMethodPattern.detailFactory;

import FactoryMethodPattern.FactoryMethodPattern.abstractFactory.ICarFactory;
import FactoryMethodPattern.car.abstractProduct.ICar;
import FactoryMethodPattern.car.detailProduct.BMWCar;

/**
 * Created by Administrator on 2017/1/10.
 */
public class BMWCarFactory implements ICarFactory{
    public ICar createCar() {
        return new BMWCar();
    }
}
