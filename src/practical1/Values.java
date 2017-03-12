
package practical1;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="value">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "values")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Values {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Values.Value> value;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Values.Value }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Values.Value> getValue() {
        if (value == null) {
            value = new ArrayList<Values.Value>();
        }
        return this.value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Value {

        @XmlAttribute(name = "x", required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected float x;
        @XmlAttribute(name = "y", required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected float y;

        /**
         * Gets the value of the x property.
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public float getX() {
            return x;
        }

        /**
         * Sets the value of the x property.
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setX(float value) {
            this.x = value;
        }

        /**
         * Gets the value of the y property.
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public float getY() {
            return y;
        }

        /**
         * Sets the value of the y property.
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setY(float value) {
            this.y = value;
        }

    }

}
