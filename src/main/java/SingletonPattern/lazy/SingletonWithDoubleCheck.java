package SingletonPattern.lazy;

/**
 * Created by Administrator on 2017/1/14.
 */
public class SingletonWithDoubleCheck {

    private static SingletonWithDoubleCheck INSTANCE;

    private SingletonWithDoubleCheck(){};

    public static SingletonWithDoubleCheck getInstance(){
        if(INSTANCE==null){
            synchronized (SingletonWithDoubleCheck.class){
                if(INSTANCE==null){
                    INSTANCE=new SingletonWithDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}

//优点：使用了双重检查，很大程度上避免了线程不安全，同时也避免了不必要的锁开销
//缺点：无
//result:avaliable