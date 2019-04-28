import model.Account;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @author 212607214
 * @Date 1/26/2019
 */
public class DroolsDemo {
    public static final void main(String[] args) {
        try {
            // load up the knowledge base
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            Account account = new Account(200);
            account.withdraw(150);
            kSession.insert(account);
            kSession.fireAllRules();

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
