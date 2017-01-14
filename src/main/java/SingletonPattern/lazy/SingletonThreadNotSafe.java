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


//�ŵ㣺�ﵽ��Lazy Loading��Ч��
//ȱ�㣺ֻ���ڵ��߳����ܱ�ֻ֤��һ��ʵ�������߳����д������ʵ���ķ���
//result:unavailable
