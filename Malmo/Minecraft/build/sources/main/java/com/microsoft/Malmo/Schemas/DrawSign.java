//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.22 at 08:31:23 AM EDT 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Draw a sign at the required location with the specified text.
 *       
 * 
 * <p>Java class for DrawSign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrawSign">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ProjectMalmo.microsoft.com}DrawObjectType">
 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="z" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="type" use="required" type="{http://ProjectMalmo.microsoft.com}SignType" />
 *       &lt;attribute name="variant" type="{http://ProjectMalmo.microsoft.com}Variation" />
 *       &lt;attribute name="colour" type="{http://ProjectMalmo.microsoft.com}Colour" />
 *       &lt;attribute name="face" type="{http://ProjectMalmo.microsoft.com}Facing" />
 *       &lt;attribute name="line1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="line2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="line3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="line4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rotation" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrawSign")
public class DrawSign
    extends DrawObjectType
{

    @XmlAttribute(name = "x", required = true)
    protected int x;
    @XmlAttribute(name = "y", required = true)
    protected int y;
    @XmlAttribute(name = "z", required = true)
    protected int z;
    @XmlAttribute(name = "type", required = true)
    protected SignType type;
    @XmlAttribute(name = "variant")
    protected Variation variant;
    @XmlAttribute(name = "colour")
    protected Colour colour;
    @XmlAttribute(name = "face")
    protected Facing face;
    @XmlAttribute(name = "line1")
    protected String line1;
    @XmlAttribute(name = "line2")
    protected String line2;
    @XmlAttribute(name = "line3")
    protected String line3;
    @XmlAttribute(name = "line4")
    protected String line4;
    @XmlAttribute(name = "rotation")
    protected Integer rotation;

    /**
     * Gets the value of the x property.
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

    /**
     * Gets the value of the z property.
     * 
     */
    public int getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     * 
     */
    public void setZ(int value) {
        this.z = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SignType }
     *     
     */
    public SignType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignType }
     *     
     */
    public void setType(SignType value) {
        this.type = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link Variation }
     *     
     */
    public Variation getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variation }
     *     
     */
    public void setVariant(Variation value) {
        this.variant = value;
    }

    /**
     * Gets the value of the colour property.
     * 
     * @return
     *     possible object is
     *     {@link Colour }
     *     
     */
    public Colour getColour() {
        return colour;
    }

    /**
     * Sets the value of the colour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Colour }
     *     
     */
    public void setColour(Colour value) {
        this.colour = value;
    }

    /**
     * Gets the value of the face property.
     * 
     * @return
     *     possible object is
     *     {@link Facing }
     *     
     */
    public Facing getFace() {
        return face;
    }

    /**
     * Sets the value of the face property.
     * 
     * @param value
     *     allowed object is
     *     {@link Facing }
     *     
     */
    public void setFace(Facing value) {
        this.face = value;
    }

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the line3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine3() {
        return line3;
    }

    /**
     * Sets the value of the line3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine3(String value) {
        this.line3 = value;
    }

    /**
     * Gets the value of the line4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine4() {
        return line4;
    }

    /**
     * Sets the value of the line4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine4(String value) {
        this.line4 = value;
    }

    /**
     * Gets the value of the rotation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRotation(Integer value) {
        this.rotation = value;
    }

}
