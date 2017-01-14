package ProxyPatternAndDecoratorPattern.DecoratorPattern;

/**
 * Created by Administrator on 2017/1/12.
 */
public class Test {

    public static void main(String [] argv){
        ISubject subject=new ConcreteSubject();
        ISubject preDecorator=new SubjectPreDecorator(subject);
        ISubject postDecorator=new SubjectPostDecorator(preDecorator);
        postDecorator.action();
    }
}
