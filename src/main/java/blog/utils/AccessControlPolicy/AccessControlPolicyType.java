
package blog.utils.AccessControlPolicy;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AccessControlPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessControlPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Owner" type="{}OwnerType"/>
 *         &lt;element name="AccessControlList" type="{}AccessControlListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "AccessControlPolicy")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessControlPolicyType", propOrder = {
    "owner",
    "accessControlList"
})
public class AccessControlPolicyType {

    @XmlElement(name = "Owner", required = true)
    protected OwnerType owner;
    @XmlElement(name = "AccessControlList", required = true)
    protected AccessControlListType accessControlList;

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerType }
     *     
     */
    public OwnerType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerType }
     *     
     */
    public void setOwner(OwnerType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the accessControlList property.
     * 
     * @return
     *     possible object is
     *     {@link AccessControlListType }
     *     
     */
    public AccessControlListType getAccessControlList() {
        return accessControlList;
    }

    /**
     * Sets the value of the accessControlList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessControlListType }
     *     
     */
    public void setAccessControlList(AccessControlListType value) {
        this.accessControlList = value;
    }

}
