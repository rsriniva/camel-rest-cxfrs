package com.buildria.camel.cxfrs.employers;

import java.util.ArrayList;
import java.util.List;
import org.apache.camel.Header;

/**
 *
 * @author sogabe
 */
public class EmployersServiceImpl extends EmployersService {

    @Override
    public Employer getEmployer(@Header("id") long id) {
        return new Employer(id, "Bob", "NYT");
    }

    @Override
    public Employers getEmployers() {
        Employers employers = new Employers();
        List<Employer> list = new ArrayList<>();
        list.add(new Employer(1, "Bob", "Chiba"));
        list.add(new Employer(2, "Job", "Tokyo"));
        list.add(new Employer(3, "たろう", "神奈川"));
        employers.setEmployers(list);
        return employers;
    }

}
