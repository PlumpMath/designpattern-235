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

//name������Ϊ���ڲ�״̬���ڹ���ʱȷ����externalState�����ⲿ״̬���ɿͻ����ڵ���ʱ���롣
