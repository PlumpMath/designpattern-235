package FactoryMethodPattern.FactoryMethodPattern.detailFactory;

import FactoryMethodPattern.FactoryMethodPattern.abstractFactory.ICarFactory;
import FactoryMethodPattern.car.abstractProduct.ICar;
import FactoryMethodPattern.car.detailProduct.LandRoverCar;

/**
 * Created by Administrator on 2017/1/10.
 */
public class LandRoverCarFactory implements ICarFactory{
    public ICar createCar() {
        return new LandRoverCar();
    }
}
