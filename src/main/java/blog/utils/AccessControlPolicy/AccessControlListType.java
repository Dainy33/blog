
package blog.utils.AccessControlPolicy;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AccessControlListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessControlListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Grant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessControlListType", propOrder = {
    "grant"
})
public class AccessControlListType {

    @XmlElement(name = "Grant", required = true)
    protected String grant;

    /**
     * Gets the value of the grant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrant() {
        return grant;
    }

    /**
     * Sets the value of the grant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrant(String value) {
        this.grant = value;
    }

}
