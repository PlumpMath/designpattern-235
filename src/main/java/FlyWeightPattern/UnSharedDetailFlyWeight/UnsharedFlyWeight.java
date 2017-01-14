package FlyWeightPattern.UnSharedDetailFlyWeight;

import FlyWeightPattern.FlyWeightInterface.FlyWeight;

/**
 * Created by Administrator on 2017/1/14.
 */
public class UnsharedFlyWeight implements FlyWeight {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void action(String externalState) {
        //log
    }
}
