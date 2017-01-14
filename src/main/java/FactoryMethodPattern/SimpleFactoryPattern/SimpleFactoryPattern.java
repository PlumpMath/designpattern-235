package FactoryMethodPattern.SimpleFactoryPattern;

import FactoryMethodPattern.car.abstractProduct.ICar;
import FactoryMethodPattern.car.detailProduct.BMWCar;
import FactoryMethodPattern.car.detailProduct.BenzCar;
import FactoryMethodPattern.car.detailProduct.LandRoverCar;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;


/**
 * Created by Administrator on 2017/1/9.
 */
public class SimpleFactoryPattern {

    public static ICar newCar(){
        ICar ICar =null;
        String name=null;
        try{
            //也可以在该方法中通过传递参数的方式将type传进来，
            XMLConfiguration xmlConfiguration=new XMLConfiguration("Car.xml");
            name=xmlConfiguration.getString("Car.name");
        }catch (ConfigurationException e){
            //log
        }

        if(name.equalsIgnoreCase("Land Rover")){
            ICar =new LandRoverCar();
        }else if(name.equalsIgnoreCase("BMW")){
            ICar =new BMWCar();
        }else if(name.equalsIgnoreCase("Benz")){
            ICar =new BenzCar();
        }

        return ICar;
    }

    //test
    public static void main(String [] args) throws Throwable{
        ICar ICar =SimpleFactoryPattern.newCar();
        ICar.drive();
    }

}
