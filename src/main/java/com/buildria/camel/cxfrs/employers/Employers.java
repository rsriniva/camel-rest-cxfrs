package com.buildria.camel.cxfrs.employers;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Employers
 *
 * @author sogabe
 */
@XmlRootElement(name = "employers")
public class Employers {

    private List<Employer> employers;

    @XmlElement(name = "employ")
    public List<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(List<Employer> employers) {
        this.employers = employers;
    }

}
