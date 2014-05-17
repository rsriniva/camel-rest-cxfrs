package com.buildria.camel.cxfrs.employers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * EmployersService
 *
 * @author sogabe
 */
@Path("/es")
public class EmployersService {

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public Employers getEmployers() {
        return null;
    }

    @GET
    @Path("/employer/{id}")
    @Produces({MediaType.APPLICATION_XML})
    public Employer getEmployer(@PathParam("id") long id) {
        return null;
    }
}
