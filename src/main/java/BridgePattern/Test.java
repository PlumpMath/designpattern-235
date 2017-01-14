package BridgePattern;

import BridgePattern.AbstarctDimension2.Transmission;
import BridgePattern.AbstractDimension1.AbstractCar;
import BridgePattern.DetailDimension1.BMWCar;
import BridgePattern.DetailDimension1.BenzCar;
import BridgePattern.DetailDimension2.AutoTransmission;
import BridgePattern.DetailDimension2.ManualTransmission;

/**
 * Created by Administrator on 2017/1/14.
 */
public class Test {

    public static void main(String [] argv) throws Throwable{
        Transmission auto=new AutoTransmission();
        AbstractCar bmw=new BMWCar();
        bmw.setTransmission(auto);
        bmw.run();

        Transmission manual=new ManualTransmission();
        AbstractCar benz=new BenzCar();
        benz.setTransmission(manual);
        benz.run();
    }
}
