package BridgePattern.AbstractDimension1;

import BridgePattern.AbstarctDimension2.Transmission;

/**
 * Created by Administrator on 2017/1/14.
 */
public abstract class AbstractCar {

    protected Transmission gear;

    public abstract void run();

    public void setTransmission(Transmission gear){
        this.gear=gear;
    }

}
