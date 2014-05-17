package com.buildria.camel.cxfrs.employers;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Customer
 *
 * @author sogabe
 */
@XmlRootElement(name = "employer")
public class Employer {

    private long id;

    private String name;

    private String address;

    public Employer() {
    }

    public Employer(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    @XmlAttribute(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @XmlTransient
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
