package assignment2_5;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 10-2-17 @ 11:52
 */

public class JaxbMain2 {
    public static void main(String[] args) {
        try {

            File file = new File("src" + File.separator + "assignment2_5" + File.separator + "customer_address.xml");

            // Parse the XML context of the customer class.
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);


            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
            System.out.println(customer);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}