package BridgePattern.DetailDimension1;

import BridgePattern.AbstractDimension1.AbstractCar;

/**
 * Created by Administrator on 2017/1/14.
 */
public class BenzCar extends AbstractCar {
    @Override
    public void run() {
        gear.gear();
        //log
    }
}
