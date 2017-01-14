package FlyWeightPattern.FlyWeightFactory;

import FlyWeightPattern.DetailFlyWeight.DetailFlyWeight;
import FlyWeightPattern.FlyWeightInterface.FlyWeight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2017/1/14.
 */
public class FlyWeightFactory {

    private static ConcurrentHashMap<String,FlyWeight> allFlyWeight=new ConcurrentHashMap<String, FlyWeight>();

    public static FlyWeight getFlyWeight(String name){
        if(allFlyWeight.get(name)==null){
            synchronized (allFlyWeight){
                if(allFlyWeight.get(name)==null){
                    FlyWeight flyWeight=new DetailFlyWeight(name);
                    allFlyWeight.put(name,flyWeight);
                }
            }
        }
        return allFlyWeight.get(name);
    }

}
