//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.22 at 08:31:23 AM EDT 
//


package com.microsoft.Malmo.Schemas;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="ChatMatch" type="{http://ProjectMalmo.microsoft.com}ChatMatchSpec"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://ProjectMalmo.microsoft.com}RewardProducerAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "chatMatch"
})
@XmlRootElement(name = "RewardForSendingMatchingChatMessage")
public class RewardForSendingMatchingChatMessage {

    @XmlElement(name = "ChatMatch")
    protected List<ChatMatchSpec> chatMatch;
    @XmlAttribute(name = "dimension")
    protected Integer dimension;

    /**
     * Gets the value of the chatMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chatMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChatMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChatMatchSpec }
     * 
     * 
     */
    public List<ChatMatchSpec> getChatMatch() {
        if (chatMatch == null) {
            chatMatch = new ArrayList<ChatMatchSpec>();
        }
        return this.chatMatch;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDimension() {
        if (dimension == null) {
            return  0;
        } else {
            return dimension;
        }
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDimension(Integer value) {
        this.dimension = value;
    }

}
