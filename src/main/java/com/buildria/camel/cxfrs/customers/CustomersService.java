package com.buildria.camel.cxfrs.customers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * CustomersService
 *
 * @author sogabe
 */
@Path("/cs/")
public class CustomersService {

    @GET
    @Path("/customers/")
    @Produces({"application/json", "application/xml"})
    public Customers getCustomers() {
        return null;
    }

    @GET
    @Path("/customer/{id}")
    public Customer getCustomer(@PathParam("id") long id) {
        return null;
    }
}
