package AbstractFactoryPattern.detailFactory;

import AbstractFactoryPattern.abstractFactory.IFactory;
import AbstractFactoryPattern.abstractProduct.ICar;
import AbstractFactoryPattern.abstractProduct.IPlane;
import AbstractFactoryPattern.abstractProduct.IShip;
import AbstractFactoryPattern.detailProduct.LandRoverCar;
import AbstractFactoryPattern.detailProduct.LandRoverPlane;
import AbstractFactoryPattern.detailProduct.LandRoverShip;

/**
 * Created by Administrator on 2017/1/11.
 */
public class LandRoverFactory implements IFactory{
    public ICar createCar() {
        return new LandRoverCar();
    }

    public IShip createShip() {
        return new LandRoverShip();
    }

    public IPlane createPlane() {
        return new LandRoverPlane();
    }
}
