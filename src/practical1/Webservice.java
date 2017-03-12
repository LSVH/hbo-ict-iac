package practical1;

import javax.jws.WebMethod;
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
@WebService(
        name = "NormallyDistributed",
        wsdlLocation = "WEB-INF/wsdl/p1/NormallyDistributed.wsdl",
        targetNamespace = "http://lsvh.org/NormallyDistributed/",
        serviceName = "NormallyDistributedService"
)
public class Webservice {
    public static void main(String[] argv) {
        Object implementor = new Webservice();
        String address = "http://localhost:8080/services/p1";
        Endpoint.publish(address, implementor);
    }

    @WebMethod
    public String calculateNormalDistribution(List<Values> values) {
        String result = values.toString();
        System.out.println(result);
        return result;
    }
}
