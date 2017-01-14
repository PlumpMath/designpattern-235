package AbstractFactoryPattern.abstractFactory;

import AbstractFactoryPattern.abstractProduct.ICar;
import AbstractFactoryPattern.abstractProduct.IPlane;
import AbstractFactoryPattern.abstractProduct.IShip;


/**
 * Created by Administrator on 2017/1/11.
 */
public interface IFactory {

    public ICar createCar();

    public IShip createShip();

    public IPlane createPlane();
}
