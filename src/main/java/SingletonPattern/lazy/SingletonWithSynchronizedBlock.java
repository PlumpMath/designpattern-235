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


//�ŵ㣺����Ҫ��ÿ�ε���ʱ������Ч�ʱ���һ����
//ȱ�㣺��Ȼʹ����synchronized�������������̲߳���ȫ�ġ�
//result:unavaliable

