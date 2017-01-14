package FactoryMethodPattern.SimpleFactoryPattern;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/1/9.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface CarType {
    String type () default "";
}
