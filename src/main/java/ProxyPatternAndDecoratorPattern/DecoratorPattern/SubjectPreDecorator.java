package ProxyPatternAndDecoratorPattern.DecoratorPattern;

/**
 * Created by Administrator on 2017/1/12.
 */
public class SubjectPreDecorator implements ISubject{

    private ISubject subject;

    public SubjectPreDecorator(ISubject  subject){
        this.subject=subject;
    }

    public void action() {
        preAction();
        subject.action();
    }

    private void preAction(){
        //log
    }
}
