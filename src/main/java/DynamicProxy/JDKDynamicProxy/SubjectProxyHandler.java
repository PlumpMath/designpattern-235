package DynamicProxy.JDKDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/1/13.
 */
public class SubjectProxyHandler implements InvocationHandler{

    private Object target;

    @SuppressWarnings("rawtypes")
    public SubjectProxyHandler(Class clazz){
        try{
            this.target=clazz.newInstance();
        }catch(Exception e){
            //log
        }
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preAction();
        Object result=method.invoke(target,args);
        postaction();
        return result;
    }

    private void preAction(){
        //log
    }

    private void postaction(){
        //log
    }
}
