package com.buildria.camel.cxfrs.customers;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 *
 * @author sogabe
 */
public class CustomerProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        long id = exchange.getIn().getHeader("id", long.class);
        Customer customer = new Customer(id, "Bob", "NYT");
        exchange.getIn().setBody(customer);
    }

}
