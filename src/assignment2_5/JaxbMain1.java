package assignment2_5;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 10-2-17 @ 11:29
 */

public class JaxbMain1 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Luuk van Houdt");
        customer.setDateOfBirth("25 Juli 1994");
        Address address = new Address();
        address.setCity("Utrecht");
        address.setStreet("Jeanne d'Arcdreef 25");
        address.setZip("3561 SB");
        customer.setAddress(address);

        try {

            File file = new File("xml" + File.separator + "assignment2_5" + File.separator + "customer_address.xml");

            // Parse the XML context of the customer class.
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

            // Assemble the class
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // Prettify the output
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Write to the file
            jaxbMarshaller.marshal(customer, file);

            // Print to console
            jaxbMarshaller.marshal(customer, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


}