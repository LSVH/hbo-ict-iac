package assignment2_5;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 10-2-17 @ 11:22
 */

@XmlRootElement
public class Customer {
    private String name;
    private String dateOfBirth;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address=" + address +
                '}';
    }
}