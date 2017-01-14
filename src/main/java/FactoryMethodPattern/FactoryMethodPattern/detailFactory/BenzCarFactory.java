package FactoryMethodPattern.FactoryMethodPattern.detailFactory;

import FactoryMethodPattern.FactoryMethodPattern.abstractFactory.ICarFactory;
import FactoryMethodPattern.car.abstractProduct.ICar;
import FactoryMethodPattern.car.detailProduct.BenzCar;

/**
 * Created by Administrator on 2017/1/10.
 */
public class BenzCarFactory implements ICarFactory{

    public ICar createCar() {
        return new BenzCar();
    }
}
