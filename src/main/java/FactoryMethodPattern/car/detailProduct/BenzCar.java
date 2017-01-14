package FactoryMethodPattern.car.detailProduct;

import FactoryMethodPattern.car.abstractProduct.ICar;

/**
 * Created by Administrator on 2017/1/9.
 */
public class BenzCar implements ICar {

    public String getName() {
        return "BenzCar";
    }

    public void drive() {

    }
}
