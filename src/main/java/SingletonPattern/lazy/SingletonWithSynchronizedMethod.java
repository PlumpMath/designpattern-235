package SingletonPattern.lazy;

/**
 * Created by Administrator on 2017/1/14.
 */
public class SingletonWithSynchronizedMethod {

    private static SingletonWithSynchronizedMethod INSTANCE;

    private SingletonWithSynchronizedMethod(){
    }

    public static synchronized SingletonWithSynchronizedMethod getInstance(){
        if(INSTANCE==null){
            INSTANCE=new SingletonWithSynchronizedMethod();
        }
        return INSTANCE;
    }
}


//优点：线程安全，可确保正常使用下（不考虑通过反射调用私有构造方法）只有一个实例.
//缺点：每次获取实例都需要申请锁，开销大，效率低
// result:avaliable
