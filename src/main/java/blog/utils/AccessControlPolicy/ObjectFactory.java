
package blog.utils.AccessControlPolicy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dtdream.oss.model.AccessControlPolicy package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AccessControlPolicy_QNAME = new QName("", "com/dtdream/oss/model/AccessControlPolicy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dtdream.oss.model.AccessControlPolicy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccessControlPolicyType }
     * 
     */
    public AccessControlPolicyType createAccessControlPolicyType() {
        return new AccessControlPolicyType();
    }

    /**
     * Create an instance of {@link OwnerType }
     * 
     */
    public OwnerType createOwnerType() {
        return new OwnerType();
    }

    /**
     * Create an instance of {@link AccessControlListType }
     * 
     */
    public AccessControlListType createAccessControlListType() {
        return new AccessControlListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessControlPolicyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "com/dtdream/oss/model/AccessControlPolicy")
    public JAXBElement<AccessControlPolicyType> createAccessControlPolicy(AccessControlPolicyType value) {
        return new JAXBElement<AccessControlPolicyType>(_AccessControlPolicy_QNAME, AccessControlPolicyType.class, null, value);
    }

}
