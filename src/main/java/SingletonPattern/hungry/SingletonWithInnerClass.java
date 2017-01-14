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

//优点：无线程同步问题，实现了懒加载（Lazy Loading）。因为只有调用getInstance时才会装载内部类，才会创建实例
//缺点：无