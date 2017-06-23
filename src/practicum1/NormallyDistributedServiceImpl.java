package practical1;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.List;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 12-3-17 @ 16:19
 */
@WebService(endpointInterface = "practical1.NormallyDistributed")
public class NormallyDistributedServiceImpl implements NormallyDistributed {
    public static void main(String[] argv) {
        Object implementor = new NormallyDistributedServiceImpl();
        String address = "http://localhost:8080/services/p1";
        Endpoint.publish(address, implementor);
    }

    @Override
    public Results calculateNormalDistribution(Values parameters) {
        Results r = new Results();
        List<Double> dataset = parameters.getValue();
        double size = dataset.size();

        // Calculate the Mu
        double mu = 0;
        for (Double v : dataset) {
            mu += v;
        }
        mu = mu / size;

        // Calculate the Standard Deviation
        double sd = 0;
        for (Double v : dataset) {
            sd += Math.pow(v - mu, 2);
        }
        sd = Math.sqrt(sd / size);

        // Fill the object
        r.setMu(mu);
        r.setSd(sd);
        r.setAnswer(sd != 0);

        return r;
    }
}