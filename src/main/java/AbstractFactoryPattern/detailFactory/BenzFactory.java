package AbstractFactoryPattern.detailFactory;

import AbstractFactoryPattern.abstractFactory.IFactory;
import AbstractFactoryPattern.abstractProduct.ICar;
import AbstractFactoryPattern.abstractProduct.IPlane;
import AbstractFactoryPattern.abstractProduct.IShip;
import AbstractFactoryPattern.detailProduct.BenzCar;
import AbstractFactoryPattern.detailProduct.BenzPlane;
import AbstractFactoryPattern.detailProduct.BenzShip;

/**
 * Created by Administrator on 2017/1/11.
 */
public class BenzFactory implements IFactory{

    public ICar createCar() {
        return new BenzCar();
    }

    public IShip createShip() {
        return new BenzShip();
    }

    public IPlane createPlane() {
        return new BenzPlane();
    }
}
