package DynamicProxy.JDKDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/1/13.
 */
public class Test {

    public static void main(String [] argv) throws Throwable{
//        InvocationHandler handler=new SubjectProxyHandler(ConcreteSubject.class);
//        ISubject proxy= (ISubject) Proxy.newProxyInstance(Test.class.getClassLoader(),new Class[]{ISubject.class},handler);
//        proxy.action();
        testCreate();
//        testExecution();
    }

    public static void testCreate() throws Throwable{
        long startTime=System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
            InvocationHandler handler=new SubjectProxyHandler(ConcreteSubject.class);
            ISubject proxy= (ISubject) Proxy.newProxyInstance(Test.class.getClassLoader(),new Class[]{ISubject.class},handler);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("JDK proxy create time:" + (endTime - startTime) + "ms");
    }

    public static void testExecution() throws Throwable{
        InvocationHandler handler=new SubjectProxyHandler(ConcreteSubject.class);
        ISubject proxy= (ISubject) Proxy.newProxyInstance(Test.class.getClassLoader(),new Class[]{ISubject.class},handler);
        long startTime=System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
            proxy.action();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("JDK proxy execute time:"+(endTime-startTime)+"ms");
    }
}
