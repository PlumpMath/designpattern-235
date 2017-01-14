package AdapterPattern;

import AdapterPattern.Adapter.Adapter;
import AdapterPattern.DetailTarget.DetailTarget;
import AdapterPattern.TargetInterface.ITarget;

/**
 * Created by Administrator on 2017/1/14.
 */
public class Test {

    public static void main(String [] argv) throws Throwable{
        ITarget adapter=new Adapter();
        adapter.request();

        ITarget target=new DetailTarget();
        target.request();
    }
}
