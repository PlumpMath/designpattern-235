package DynamicProxy.CglibDynamicProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/1/13.
 */
public class SubjectInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        preAction();
        Object result=methodProxy.invokeSuper(o,objects);
        postAction();
        return result;
    }

    private void preAction(){
        //log
    }

    private void postAction(){
        //log
    }
}
