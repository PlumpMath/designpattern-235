package ProxyPatternAndDecoratorPattern.DecoratorPattern;

/**
 * Created by Administrator on 2017/1/12.
 */
public class SubjectPostDecorator implements ISubject{

    private ISubject subject;

    public SubjectPostDecorator(ISubject subject){
        this.subject=subject;
    }

    public void action() {
        subject.action();
        postAction();
    }

    private void postAction(){
        //log
    }
}
