package FlyWeightPattern.DetailFlyWeight;

import FlyWeightPattern.FlyWeightInterface.FlyWeight;

/**
 * Created by Administrator on 2017/1/14.
 */
public class DetailFlyWeight implements FlyWeight {

    private String name;

    public DetailFlyWeight(String name){
        this.name=name;
    }

    public void action(String externalState) {
        //log
    }
}

//name可以认为是内部状态，在构造时确定，externalState属于外部状态，由客户端在调用时传入。
