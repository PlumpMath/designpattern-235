package SingletonPattern.hungry;

/**
 * Created by Administrator on 2017/1/14.
 */
public class SingletonWithStaticBlock {

    private static SingletonWithStaticBlock INSTANCE;

    static{
        INSTANCE=new SingletonWithStaticBlock();
    }

    private SingletonWithStaticBlock() {};

    public static SingletonWithStaticBlock getInstance(){
        return INSTANCE;
    }
}


//优点：无线程同步问题
//缺点：类装载时创建实例，无Lazy Loading。实例一直未被使用时，会浪费资源
//result:avaliable

