package com.github.willb611.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/healthCheck")
public class HealthCheckService {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayHelloWorldFrom() {
    return "ok";
  }

}
