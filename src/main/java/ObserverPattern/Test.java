package ObserverPattern;

import ObserverPattern.abstractObserver.ITalent;
import ObserverPattern.abstractSubject.AbstractHR;
import ObserverPattern.detailObserver.Architect;
import ObserverPattern.detailObserver.JuniorEngineer;
import ObserverPattern.detailObserver.SeniorEngineer;
import ObserverPattern.detailSubject.HeaderHunter;

/**
 * Created by Administrator on 2017/1/11.
 */
public class Test {

    public static void main(String [] args) throws Throwable{
        ITalent juniorEngineer = new JuniorEngineer();
        ITalent seniorEngineer = new SeniorEngineer();
        ITalent architect=new Architect();

        AbstractHR hr=new HeaderHunter();
        hr.registTalent(juniorEngineer);
        hr.registTalent(seniorEngineer);
        hr.registTalent(architect);

        hr.publishJob("Top 500 big data position");
    }
}
