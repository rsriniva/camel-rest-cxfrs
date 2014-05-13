package com.buildria.camel.cxfrs.customers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * CustomersService
 *
 * @author sogabe
 */
@Path("/cs/")
public class CustomersService {

    @GET
    @Path("/customers/")
    @Produces({MediaType.APPLICATION_JSON})
    public Customers getCustomers() {
        return null;
    }

    @GET
    @Path("/customer/{id}")
    @Produces({MediaType.APPLICATION_XML})
    public Customer getCustomer(@PathParam("id") long id) {
        return null;
    }
}
