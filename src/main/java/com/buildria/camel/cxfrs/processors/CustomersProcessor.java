package com.buildria.camel.cxfrs.processors;

import com.buildria.camel.cxfrs.models.Customer;
import com.buildria.camel.cxfrs.models.Customers;
import java.util.ArrayList;
import java.util.List;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 *
 * @author sogabe
 */
public class CustomersProcessor implements Processor {
    
    @Override
    public void process(Exchange exchange) throws Exception {
        Customers customers = new Customers();
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1, "Bob", "Chiba"));
        list.add(new Customer(2, "Job", "Tokyo"));
        list.add(new Customer(3, "たろう", "神奈川"));
        customers.setCustomers(list);
        exchange.getIn().setBody(customers);
    }
    
}
