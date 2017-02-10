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

            File file = new File("src" + File.separator + "assignment2_5" + File.separator + "customer_address.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(customer, file);
            jaxbMarshaller.marshal(customer, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


}