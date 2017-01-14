package CompositePattern.simpleComponent;

import CompositePattern.abstractComponent.Organization;

/**
 * Created by Administrator on 2017/1/12.
 */
public class Department extends Organization{

    public Department(String name){
        super(name);
    }

    @Override
    public void inform(String info) {
        //log:info
    }
}
