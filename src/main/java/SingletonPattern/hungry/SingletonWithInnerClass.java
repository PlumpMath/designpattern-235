package SingletonPattern.hungry;

/**
 * Created by Administrator on 2017/1/14.
 */
public class SingletonWithInnerClass {

    private SingletonWithInnerClass(){};

    public static  SingletonWithInnerClass getInstance(){
        return InnerClass.INSTANCE;
    }

    private static class InnerClass{
        private static final SingletonWithInnerClass INSTANCE=new SingletonWithInnerClass();
    }
}

//�ŵ㣺���߳�ͬ�����⣬ʵ���������أ�Lazy Loading������Ϊֻ�е���getInstanceʱ�Ż�װ���ڲ��࣬�Żᴴ��ʵ��
//ȱ�㣺��