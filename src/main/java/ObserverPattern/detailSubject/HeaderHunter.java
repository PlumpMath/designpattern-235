package ObserverPattern.detailSubject;

import ObserverPattern.abstractSubject.AbstractHR;

/**
 * Created by Administrator on 2017/1/11.
 */
public class HeaderHunter extends AbstractHR {
    @Override
    public void publishJob(String job) {
        // allTalents.forEach(talent -> talent.newJobNotice(job));
    }
}
