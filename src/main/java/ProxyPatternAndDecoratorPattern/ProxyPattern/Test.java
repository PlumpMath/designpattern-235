package ProxyPatternAndDecoratorPattern.ProxyPattern;

/**
 * Created by Administrator on 2017/1/12.
 */
public class Test {

    public static void main(String [] argv){
        ISubject subject=new ProxySubject();
        subject.action();
    }
}
