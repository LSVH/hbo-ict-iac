
package practical1;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="answer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mu" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="variance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "answer",
        "mu",
        "variance"
})
@XmlRootElement(name = "results", namespace = "http://lsvh.org/NormallyDistributed/Response")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Results {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected boolean answer;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Float mu;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Float variance;

    /**
     * Gets the value of the answer property.
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public boolean isAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAnswer(boolean value) {
        this.answer = value;
    }

    /**
     * Gets the value of the mu property.
     *
     * @return possible object is
     * {@link Float }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Float getMu() {
        return mu;
    }

    /**
     * Sets the value of the mu property.
     *
     * @param value allowed object is
     *              {@link Float }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMu(Float value) {
        this.mu = value;
    }

    /**
     * Gets the value of the variance property.
     *
     * @return possible object is
     * {@link Float }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Float getVariance() {
        return variance;
    }

    /**
     * Sets the value of the variance property.
     *
     * @param value allowed object is
     *              {@link Float }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-12T04:15:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVariance(Float value) {
        this.variance = value;
    }

}
