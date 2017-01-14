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


//�ŵ㣺�̰߳�ȫ����ȷ������ʹ���£�������ͨ���������˽�й��췽����ֻ��һ��ʵ��.
//ȱ�㣺ÿ�λ�ȡʵ������Ҫ��������������Ч�ʵ�
// result:avaliable
