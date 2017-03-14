
package practical1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence>
 *         &lt;element name="answer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mu" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        "answer",
        "mu",
        "sd"
})
@XmlRootElement(name = "results", namespace = "http://lsvh.org/NormallyDistributed/Response/")
public class Results {

    protected boolean answer;
    protected Double mu;
    protected Double sd;

    /**
     * Gets the value of the answer property.
     * 
     */
    public boolean isAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     */
    public void setAnswer(boolean value) {
        this.answer = value;
    }

    /**
     * Gets the value of the mu property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMu() {
        return mu;
    }

    /**
     * Sets the value of the mu property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMu(Double value) {
        this.mu = value;
    }

    /**
     * Gets the value of the sd property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSd(Double value) {
        this.sd = value;
    }

}
