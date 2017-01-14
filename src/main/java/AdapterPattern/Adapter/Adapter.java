package AdapterPattern.Adapter;

import AdapterPattern.Adaptee.Adaptee;
import AdapterPattern.TargetInterface.ITarget;

/**
 * Created by Administrator on 2017/1/14.
 */
public class Adapter implements ITarget {

    private Adaptee adaptee=new Adaptee();

    public void request() {
        //log
        adaptee.onRequest();
    }
}
