package com.myapp.com;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/customers")
public class HelloWorldService {
 
  @GET
  @Produces("application/json")
  @Consumes("application/json")
  public Response getLocalCust() {
 
           String output = "I am from 'getLocalCust' method";
           return Response.status(200).entity(output).build();
  }
  @GET
  @Path("/nri")
  @Produces("application/json")
  public Response getNriCust() {
 
            String output = "I am from 'getNriCust' method";
            return Response.status(200).entity(output).build();
  }
}