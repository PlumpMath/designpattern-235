package SingletonPattern.hungry;

/**
 * Created by Administrator on 2017/1/14.
 */
public class SingletonWithStaticVariable {

    private static final SingletonWithStaticVariable INSTANCE=new SingletonWithStaticVariable();

    private SingletonWithStaticVariable(){

    }

    public static SingletonWithStaticVariable getInstance(){
        return INSTANCE;
    }
}


//优点：实现简单，无线程同步问题
//缺点：在类装载时完成实例化。若该实例一直未被使用，则会造成资源浪费
//result:avaliable

