package FactoryMethodPattern.SimpleFactoryPattern;


import FactoryMethodPattern.car.abstractProduct.ICar;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.reflections.Reflections;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2017/1/9.
 */
public class SimpleFactoryPatternWithAnnotation {

    private static Map<String,Class> typeCarMap;

    static{
        Reflections reflections=new Reflections("FactoryMethodPattern.car");
        Set<Class<?>> annotatedClasses =reflections.getTypesAnnotatedWith(CarType.class);
        typeCarMap=new ConcurrentHashMap<String, Class>();
        for(Class<?> clazz :annotatedClasses){
            CarType carType=clazz.getAnnotation(CarType.class);
            typeCarMap.put(carType.type(),clazz);
        }
        typeCarMap= Collections.unmodifiableMap(typeCarMap);
    }

    public static ICar newCar(){
        ICar ICar =null;
        String type=null;
        try{
            //也可以在该方法中通过传递参数的方式将type传进来，
            XMLConfiguration xmlConfiguration=new XMLConfiguration("Car.xml");
            type=xmlConfiguration.getString("Car.type");
        }catch (ConfigurationException e){
            //log.error
        }

        if(typeCarMap.containsKey(type)){
            try{
                ICar = (ICar) typeCarMap.get(type).newInstance();
            }catch (Exception e){
                //log.error
            }
        }else{
            //log.error
        }

        return ICar;
    }


}
