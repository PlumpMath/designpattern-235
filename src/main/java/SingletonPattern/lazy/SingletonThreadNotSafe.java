package SingletonPattern.lazy;

/**
 * Created by Administrator on 2017/1/14.
 */
public class SingletonThreadNotSafe {

    private static SingletonThreadNotSafe INSTANCE;

    public static SingletonThreadNotSafe getInstance(){
        if(INSTANCE==null){
            INSTANCE=new SingletonThreadNotSafe();
        }
        return INSTANCE;
    }
}


//优点：达到了Lazy Loading的效果
//缺点：只有在单线程下能保证只有一个实例，多线程下有创建多个实例的风险
//result:unavailable
