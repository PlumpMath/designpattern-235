package ProxyPatternAndDecoratorPattern.ProxyPattern;

import java.util.Random;

/**
 * Created by Administrator on 2017/1/12.
 */
public class ProxySubject implements ISubject{

    private ISubject subject;

    public ProxySubject(){
        subject=new ConcreteSubject();
    }

    public void action() {
        preAction();
        if((new Random()).nextBoolean()){
            subject.action();
        }else{
            //log
        }
        postAction();
    }

    private void preAction(){
        //log
    }

    private void postAction(){
        //log
    }
}
