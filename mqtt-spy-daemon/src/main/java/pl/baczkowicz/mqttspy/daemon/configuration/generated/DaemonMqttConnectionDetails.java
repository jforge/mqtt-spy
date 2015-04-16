//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.16 at 11:13:23 PM BST 
//


package pl.baczkowicz.mqttspy.daemon.configuration.generated;

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
import pl.baczkowicz.mqttspy.common.generated.MessageLog;
import pl.baczkowicz.mqttspy.common.generated.MqttConnectionDetails;
import pl.baczkowicz.mqttspy.common.generated.ScriptDetails;
import pl.baczkowicz.mqttspy.common.generated.SubscriptionDetails;


/**
 * <p>Java class for DaemonMqttConnectionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DaemonMqttConnectionDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://baczkowicz.pl/mqtt-spy/common}MqttConnectionDetails">
 *       &lt;sequence>
 *         &lt;element name="MessageLog" type="{http://baczkowicz.pl/mqtt-spy/common}MessageLog"/>
 *         &lt;element name="Subscription" type="{http://baczkowicz.pl/mqtt-spy/common}SubscriptionDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BackgroundScript" type="{http://baczkowicz.pl/mqtt-spy/common}ScriptDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RunningMode" type="{http://baczkowicz.pl/mqtt-spy/daemon/configuration}RunningMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaemonMqttConnectionDetails", propOrder = {
    "messageLog",
    "subscription",
    "backgroundScript",
    "runningMode"
})
public class DaemonMqttConnectionDetails
    extends MqttConnectionDetails
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElement(name = "MessageLog", required = true)
    protected MessageLog messageLog;
    @XmlElement(name = "Subscription")
    protected List<SubscriptionDetails> subscription;
    @XmlElement(name = "BackgroundScript")
    protected List<ScriptDetails> backgroundScript;
    @XmlElement(name = "RunningMode")
    protected RunningMode runningMode;

    /**
     * Gets the value of the messageLog property.
     * 
     * @return
     *     possible object is
     *     {@link MessageLog }
     *     
     */
    public MessageLog getMessageLog() {
        return messageLog;
    }

    /**
     * Sets the value of the messageLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageLog }
     *     
     */
    public void setMessageLog(MessageLog value) {
        this.messageLog = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionDetails }
     * 
     * 
     */
    public List<SubscriptionDetails> getSubscription() {
        if (subscription == null) {
            subscription = new ArrayList<SubscriptionDetails>();
        }
        return this.subscription;
    }

    /**
     * Gets the value of the backgroundScript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backgroundScript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackgroundScript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScriptDetails }
     * 
     * 
     */
    public List<ScriptDetails> getBackgroundScript() {
        if (backgroundScript == null) {
            backgroundScript = new ArrayList<ScriptDetails>();
        }
        return this.backgroundScript;
    }

    /**
     * Gets the value of the runningMode property.
     * 
     * @return
     *     possible object is
     *     {@link RunningMode }
     *     
     */
    public RunningMode getRunningMode() {
        return runningMode;
    }

    /**
     * Sets the value of the runningMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunningMode }
     *     
     */
    public void setRunningMode(RunningMode value) {
        this.runningMode = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            MessageLog theMessageLog;
            theMessageLog = this.getMessageLog();
            toStringBuilder.append("messageLog", theMessageLog);
        }
        {
            List<SubscriptionDetails> theSubscription;
            theSubscription = this.getSubscription();
            toStringBuilder.append("subscription", theSubscription);
        }
        {
            List<ScriptDetails> theBackgroundScript;
            theBackgroundScript = this.getBackgroundScript();
            toStringBuilder.append("backgroundScript", theBackgroundScript);
        }
        {
            RunningMode theRunningMode;
            theRunningMode = this.getRunningMode();
            toStringBuilder.append("runningMode", theRunningMode);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof DaemonMqttConnectionDetails)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final DaemonMqttConnectionDetails that = ((DaemonMqttConnectionDetails) object);
        equalsBuilder.append(this.getMessageLog(), that.getMessageLog());
        equalsBuilder.append(this.getSubscription(), that.getSubscription());
        equalsBuilder.append(this.getBackgroundScript(), that.getBackgroundScript());
        equalsBuilder.append(this.getRunningMode(), that.getRunningMode());
    }

    public boolean equals(Object object) {
        if (!(object instanceof DaemonMqttConnectionDetails)) {
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
        hashCodeBuilder.append(this.getMessageLog());
        hashCodeBuilder.append(this.getSubscription());
        hashCodeBuilder.append(this.getBackgroundScript());
        hashCodeBuilder.append(this.getRunningMode());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final DaemonMqttConnectionDetails copy = ((target == null)?((DaemonMqttConnectionDetails) createCopy()):((DaemonMqttConnectionDetails) target));
        super.copyTo(copy, copyBuilder);
        {
            MessageLog sourceMessageLog;
            sourceMessageLog = this.getMessageLog();
            MessageLog copyMessageLog = ((MessageLog) copyBuilder.copy(sourceMessageLog));
            copy.setMessageLog(copyMessageLog);
        }
        {
            List<SubscriptionDetails> sourceSubscription;
            sourceSubscription = this.getSubscription();
            List<SubscriptionDetails> copySubscription = ((List<SubscriptionDetails> ) copyBuilder.copy(sourceSubscription));
            copy.subscription = null;
            List<SubscriptionDetails> uniqueSubscriptionl = copy.getSubscription();
            uniqueSubscriptionl.addAll(copySubscription);
        }
        {
            List<ScriptDetails> sourceBackgroundScript;
            sourceBackgroundScript = this.getBackgroundScript();
            List<ScriptDetails> copyBackgroundScript = ((List<ScriptDetails> ) copyBuilder.copy(sourceBackgroundScript));
            copy.backgroundScript = null;
            List<ScriptDetails> uniqueBackgroundScriptl = copy.getBackgroundScript();
            uniqueBackgroundScriptl.addAll(copyBackgroundScript);
        }
        {
            RunningMode sourceRunningMode;
            sourceRunningMode = this.getRunningMode();
            RunningMode copyRunningMode = ((RunningMode) copyBuilder.copy(sourceRunningMode));
            copy.setRunningMode(copyRunningMode);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new DaemonMqttConnectionDetails();
    }

}
