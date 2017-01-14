package FactoryMethodPattern.SimpleFactoryPattern;

import FactoryMethodPattern.car.abstractProduct.ICar;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

/**
 * Created by Administrator on 2017/1/9.
 */
public class SimpleFactoryPatternWithReflection {

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

        try{
            ICar = (ICar) Class.forName(name).newInstance();
            //log
        }catch (Exception e){

        }

        return ICar;
    }

    public static void main(String [] argv){
        ICar ICar =SimpleFactoryPatternWithReflection.newCar();
        ICar.drive();
    }
}
