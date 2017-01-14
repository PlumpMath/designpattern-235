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


//�ŵ㣺���߳�ͬ������
//ȱ�㣺��װ��ʱ����ʵ������Lazy Loading��ʵ��һֱδ��ʹ��ʱ�����˷���Դ
//result:avaliable

