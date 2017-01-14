package ObserverPattern.abstractSubject;

import ObserverPattern.abstractObserver.ITalent;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Administrator on 2017/1/11.
 */
public abstract class AbstractHR {

    protected Collection<ITalent> allTalents=new ArrayList<ITalent>();

    public abstract void publishJob(String job);

    public void registTalent(ITalent talent){
        allTalents.add(talent);
    }

    public void removeTalent(ITalent talent){
        allTalents.remove(talent);
    }

}
