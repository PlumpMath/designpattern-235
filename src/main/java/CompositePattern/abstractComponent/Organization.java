package CompositePattern.abstractComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/12.
 */
public abstract class Organization {

    private List<Organization> childOrgnizations=new ArrayList<Organization>();

    private String name;

    public Organization(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrgnization(Organization organization){
        childOrgnizations.add(organization);
    }

    public void removeOrgnization(Organization organization){
        childOrgnizations.remove(organization);
    }

    public List<Organization> getAllOrgnizations(){
        return childOrgnizations;
    }

    public abstract void inform(String info);

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Organization)){
            return false;
        }
        return this.name.equals(((Organization)object).name);
    }
}
