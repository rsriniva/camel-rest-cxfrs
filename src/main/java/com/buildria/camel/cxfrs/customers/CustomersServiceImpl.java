package com.buildria.camel.cxfrs.customers;

import java.util.ArrayList;
import java.util.List;
import org.apache.camel.Header;

/**
 *
 * @author sogabe
 */
public class CustomersServiceImpl extends CustomersService {

    @Override
    public Customer getCustomer(@Header("id") long id) {
        return new Customer(id, "Bob", "NYT");
    }

    @Override
    public Customers getCustomers() {
        Customers customers = new Customers();
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1, "Bob", "Chiba"));
        list.add(new Customer(2, "Job", "Tokyo"));
        list.add(new Customer(3, "たろう", "神奈川"));
        customers.setCustomers(list);
        return customers;
    }

}
