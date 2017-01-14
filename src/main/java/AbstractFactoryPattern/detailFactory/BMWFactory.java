package AbstractFactoryPattern.detailFactory;

import AbstractFactoryPattern.abstractFactory.IFactory;
import AbstractFactoryPattern.abstractProduct.ICar;
import AbstractFactoryPattern.abstractProduct.IPlane;
import AbstractFactoryPattern.abstractProduct.IShip;
import AbstractFactoryPattern.detailProduct.BMWCar;
import AbstractFactoryPattern.detailProduct.BMWPlane;
import AbstractFactoryPattern.detailProduct.BMWShip;


/**
 * Created by Administrator on 2017/1/11.
 */
public class BMWFactory implements IFactory {
    public ICar createCar() {
        return new BMWCar();
    }

    public IShip createShip() {
        return new BMWShip();
    }

    public IPlane createPlane() {
        return new BMWPlane();
    }
}
