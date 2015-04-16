//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.16 at 11:13:16 PM BST 
//


package pl.baczkowicz.mqttspy.common.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for MqttConnectionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MqttConnectionDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://baczkowicz.pl/mqtt-spy/common}ConnectionDetails">
 *       &lt;sequence>
 *         &lt;element name="ServerURI" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserCredentials" type="{http://baczkowicz.pl/mqtt-spy/common}UserCredentials" minOccurs="0"/>
 *         &lt;element name="LastWillAndTestament" type="{http://baczkowicz.pl/mqtt-spy/common}SimpleMqttMessage" minOccurs="0"/>
 *         &lt;element name="CleanSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConnectionTimeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="KeepAliveInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReconnectionSettings" type="{http://baczkowicz.pl/mqtt-spy/common}ReconnectionSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MqttConnectionDetails", propOrder = {
    "serverURI",
    "clientID",
    "userCredentials",
    "lastWillAndTestament",
    "cleanSession",
    "connectionTimeout",
    "keepAliveInterval",
    "reconnectionSettings"
})
public class MqttConnectionDetails
    extends ConnectionDetails
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElement(name = "ServerURI", required = true)
    protected List<String> serverURI;
    @XmlElement(name = "ClientID", required = true)
    protected String clientID;
    @XmlElement(name = "UserCredentials")
    protected UserCredentials userCredentials;
    @XmlElement(name = "LastWillAndTestament")
    protected SimpleMqttMessage lastWillAndTestament;
    @XmlElement(name = "CleanSession")
    protected Boolean cleanSession;
    @XmlElement(name = "ConnectionTimeout")
    protected Integer connectionTimeout;
    @XmlElement(name = "KeepAliveInterval")
    protected Integer keepAliveInterval;
    @XmlElement(name = "ReconnectionSettings")
    protected ReconnectionSettings reconnectionSettings;

    /**
     * Default no-arg constructor
     * 
     */
    public MqttConnectionDetails() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MqttConnectionDetails(final String name, final ProtocolEnum protocol, final List<String> serverURI, final String clientID, final UserCredentials userCredentials, final SimpleMqttMessage lastWillAndTestament, final Boolean cleanSession, final Integer connectionTimeout, final Integer keepAliveInterval, final ReconnectionSettings reconnectionSettings) {
        super(name, protocol);
        this.serverURI = serverURI;
        this.clientID = clientID;
        this.userCredentials = userCredentials;
        this.lastWillAndTestament = lastWillAndTestament;
        this.cleanSession = cleanSession;
        this.connectionTimeout = connectionTimeout;
        this.keepAliveInterval = keepAliveInterval;
        this.reconnectionSettings = reconnectionSettings;
    }

    /**
     * Gets the value of the serverURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServerURI() {
        if (serverURI == null) {
            serverURI = new ArrayList<String>();
        }
        return this.serverURI;
    }

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the userCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link UserCredentials }
     *     
     */
    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    /**
     * Sets the value of the userCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCredentials }
     *     
     */
    public void setUserCredentials(UserCredentials value) {
        this.userCredentials = value;
    }

    /**
     * Gets the value of the lastWillAndTestament property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleMqttMessage }
     *     
     */
    public SimpleMqttMessage getLastWillAndTestament() {
        return lastWillAndTestament;
    }

    /**
     * Sets the value of the lastWillAndTestament property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleMqttMessage }
     *     
     */
    public void setLastWillAndTestament(SimpleMqttMessage value) {
        this.lastWillAndTestament = value;
    }

    /**
     * Gets the value of the cleanSession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCleanSession() {
        return cleanSession;
    }

    /**
     * Sets the value of the cleanSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCleanSession(Boolean value) {
        this.cleanSession = value;
    }

    /**
     * Gets the value of the connectionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * Sets the value of the connectionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectionTimeout(Integer value) {
        this.connectionTimeout = value;
    }

    /**
     * Gets the value of the keepAliveInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKeepAliveInterval() {
        return keepAliveInterval;
    }

    /**
     * Sets the value of the keepAliveInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKeepAliveInterval(Integer value) {
        this.keepAliveInterval = value;
    }

    /**
     * Gets the value of the reconnectionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ReconnectionSettings }
     *     
     */
    public ReconnectionSettings getReconnectionSettings() {
        return reconnectionSettings;
    }

    /**
     * Sets the value of the reconnectionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconnectionSettings }
     *     
     */
    public void setReconnectionSettings(ReconnectionSettings value) {
        this.reconnectionSettings = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            List<String> theServerURI;
            theServerURI = this.getServerURI();
            toStringBuilder.append("serverURI", theServerURI);
        }
        {
            String theClientID;
            theClientID = this.getClientID();
            toStringBuilder.append("clientID", theClientID);
        }
        {
            UserCredentials theUserCredentials;
            theUserCredentials = this.getUserCredentials();
            toStringBuilder.append("userCredentials", theUserCredentials);
        }
        {
            SimpleMqttMessage theLastWillAndTestament;
            theLastWillAndTestament = this.getLastWillAndTestament();
            toStringBuilder.append("lastWillAndTestament", theLastWillAndTestament);
        }
        {
            Boolean theCleanSession;
            theCleanSession = this.isCleanSession();
            toStringBuilder.append("cleanSession", theCleanSession);
        }
        {
            Integer theConnectionTimeout;
            theConnectionTimeout = this.getConnectionTimeout();
            toStringBuilder.append("connectionTimeout", theConnectionTimeout);
        }
        {
            Integer theKeepAliveInterval;
            theKeepAliveInterval = this.getKeepAliveInterval();
            toStringBuilder.append("keepAliveInterval", theKeepAliveInterval);
        }
        {
            ReconnectionSettings theReconnectionSettings;
            theReconnectionSettings = this.getReconnectionSettings();
            toStringBuilder.append("reconnectionSettings", theReconnectionSettings);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof MqttConnectionDetails)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final MqttConnectionDetails that = ((MqttConnectionDetails) object);
        equalsBuilder.append(this.getServerURI(), that.getServerURI());
        equalsBuilder.append(this.getClientID(), that.getClientID());
        equalsBuilder.append(this.getUserCredentials(), that.getUserCredentials());
        equalsBuilder.append(this.getLastWillAndTestament(), that.getLastWillAndTestament());
        equalsBuilder.append(this.isCleanSession(), that.isCleanSession());
        equalsBuilder.append(this.getConnectionTimeout(), that.getConnectionTimeout());
        equalsBuilder.append(this.getKeepAliveInterval(), that.getKeepAliveInterval());
        equalsBuilder.append(this.getReconnectionSettings(), that.getReconnectionSettings());
    }

    public boolean equals(Object object) {
        if (!(object instanceof MqttConnectionDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        super.hashCode(hashCodeBuilder);
        hashCodeBuilder.append(this.getServerURI());
        hashCodeBuilder.append(this.getClientID());
        hashCodeBuilder.append(this.getUserCredentials());
        hashCodeBuilder.append(this.getLastWillAndTestament());
        hashCodeBuilder.append(this.isCleanSession());
        hashCodeBuilder.append(this.getConnectionTimeout());
        hashCodeBuilder.append(this.getKeepAliveInterval());
        hashCodeBuilder.append(this.getReconnectionSettings());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final MqttConnectionDetails copy = ((target == null)?((MqttConnectionDetails) createCopy()):((MqttConnectionDetails) target));
        super.copyTo(copy, copyBuilder);
        {
            List<String> sourceServerURI;
            sourceServerURI = this.getServerURI();
            List<String> copyServerURI = ((List<String> ) copyBuilder.copy(sourceServerURI));
            copy.serverURI = null;
            List<String> uniqueServerURIl = copy.getServerURI();
            uniqueServerURIl.addAll(copyServerURI);
        }
        {
            String sourceClientID;
            sourceClientID = this.getClientID();
            String copyClientID = ((String) copyBuilder.copy(sourceClientID));
            copy.setClientID(copyClientID);
        }
        {
            UserCredentials sourceUserCredentials;
            sourceUserCredentials = this.getUserCredentials();
            UserCredentials copyUserCredentials = ((UserCredentials) copyBuilder.copy(sourceUserCredentials));
            copy.setUserCredentials(copyUserCredentials);
        }
        {
            SimpleMqttMessage sourceLastWillAndTestament;
            sourceLastWillAndTestament = this.getLastWillAndTestament();
            SimpleMqttMessage copyLastWillAndTestament = ((SimpleMqttMessage) copyBuilder.copy(sourceLastWillAndTestament));
            copy.setLastWillAndTestament(copyLastWillAndTestament);
        }
        {
            Boolean sourceCleanSession;
            sourceCleanSession = this.isCleanSession();
            Boolean copyCleanSession = ((Boolean) copyBuilder.copy(sourceCleanSession));
            copy.setCleanSession(copyCleanSession);
        }
        {
            Integer sourceConnectionTimeout;
            sourceConnectionTimeout = this.getConnectionTimeout();
            Integer copyConnectionTimeout = ((Integer) copyBuilder.copy(sourceConnectionTimeout));
            copy.setConnectionTimeout(copyConnectionTimeout);
        }
        {
            Integer sourceKeepAliveInterval;
            sourceKeepAliveInterval = this.getKeepAliveInterval();
            Integer copyKeepAliveInterval = ((Integer) copyBuilder.copy(sourceKeepAliveInterval));
            copy.setKeepAliveInterval(copyKeepAliveInterval);
        }
        {
            ReconnectionSettings sourceReconnectionSettings;
            sourceReconnectionSettings = this.getReconnectionSettings();
            ReconnectionSettings copyReconnectionSettings = ((ReconnectionSettings) copyBuilder.copy(sourceReconnectionSettings));
            copy.setReconnectionSettings(copyReconnectionSettings);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new MqttConnectionDetails();
    }

}
