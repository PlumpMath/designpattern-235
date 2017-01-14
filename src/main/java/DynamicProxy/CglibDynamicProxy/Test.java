package DynamicProxy.CglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * Created by Administrator on 2017/1/13.
 */
public class Test {

    public static void main(String [] argv) throws  Throwable{
//        MethodInterceptor methodInterceptor=new SubjectInterceptor();
//        Enhancer enhancer=new Enhancer();
//        enhancer.setSuperclass(ConcreteSubject.class);
//        enhancer.setCallback(methodInterceptor);
//        ISubject subject= (ISubject) enhancer.create();
//        subject.action();
        testCreate();
//        testExecution();
    }

    public static void testCreate() throws Throwable{
        long startTime=System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
            MethodInterceptor methodInterceptor=new SubjectInterceptor();
            Enhancer enhancer=new Enhancer();
            enhancer.setSuperclass(ConcreteSubject.class);
            enhancer.setCallback(methodInterceptor);
            ISubject subject= (ISubject) enhancer.create();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("cglib proxy create time:" + (endTime - startTime) + "ms");
    }

    public static void testExecution() throws Throwable{
        MethodInterceptor methodInterceptor=new SubjectInterceptor();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(ConcreteSubject.class);
        enhancer.setCallback(methodInterceptor);
        ISubject subject= (ISubject) enhancer.create();
        long startTime=System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
            subject.action();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("cglib proxy execute time:"+(endTime-startTime)+"ms");
    }


}
