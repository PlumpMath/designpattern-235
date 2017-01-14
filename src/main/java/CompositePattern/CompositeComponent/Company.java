package CompositePattern.CompositeComponent;

import CompositePattern.abstractComponent.Organization;

import java.util.List;

/**
 * Created by Administrator on 2017/1/12.
 */
public class Company extends Organization{

    public Company(String name){
        super(name);
    }

    @Override
    public void inform(String info) {
        //log:info
        List<Organization> childOrgnizations=getAllOrgnizations();
        //childOrgnizations.forEach(org->org.infom(info))
    }
}
