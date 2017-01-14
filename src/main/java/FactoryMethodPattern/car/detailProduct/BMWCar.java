package FactoryMethodPattern.car.detailProduct;

import FactoryMethodPattern.car.abstractProduct.ICar;

/**
 * Created by Administrator on 2017/1/9.
 */
public class BMWCar implements ICar {
    public String getName() {
        return "BMWCarFactory";
    }

    public void drive() {

    }
}
