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

//�ŵ㣺ʹ����˫�ؼ�飬�ܴ�̶��ϱ������̲߳���ȫ��ͬʱҲ�����˲���Ҫ��������
//ȱ�㣺��
//result:avaliable