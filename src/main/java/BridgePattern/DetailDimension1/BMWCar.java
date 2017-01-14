package BridgePattern.DetailDimension1;

import BridgePattern.AbstractDimension1.AbstractCar;

/**
 * Created by Administrator on 2017/1/14.
 */
public class BMWCar extends AbstractCar {

    @Override
    public void run() {
        gear.gear();
        //log:BMW is running
    }
}
