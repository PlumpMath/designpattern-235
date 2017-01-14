package SingletonPattern.lazy;

/**
 * Created by Administrator on 2017/1/14.
 */
public class SingletonWithSynchronizedBlock {
    private static SingletonWithSynchronizedBlock INSTANCE;

    private SingletonWithSynchronizedBlock(){
    }

    public static SingletonWithSynchronizedBlock getInstance(){
        if(INSTANCE==null){
            synchronized (SingletonWithSynchronizedBlock.class){
                INSTANCE=new SingletonWithSynchronizedBlock();
            }
        }
        return INSTANCE;
    }
}


//优点：不需要在每次调用时加锁，效率比上一个高
//缺点：虽然使用了synchronized，但本质上是线程不安全的。
//result:unavaliable

