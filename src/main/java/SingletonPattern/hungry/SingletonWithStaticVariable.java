package SingletonPattern.hungry;

/**
 * Created by Administrator on 2017/1/14.
 */
public class SingletonWithStaticVariable {

    private static final SingletonWithStaticVariable INSTANCE=new SingletonWithStaticVariable();

    private SingletonWithStaticVariable(){

    }

    public static SingletonWithStaticVariable getInstance(){
        return INSTANCE;
    }
}


//�ŵ㣺ʵ�ּ򵥣����߳�ͬ������
//ȱ�㣺����װ��ʱ���ʵ����������ʵ��һֱδ��ʹ�ã���������Դ�˷�
//result:avaliable

