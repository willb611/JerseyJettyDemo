package com.github.willb611.services;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class HelloWorldService {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayHelloWorldFrom() {
    String result = "Hello, stranger.";
    System.out.println(result);
    return result;
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("{from}")
  public String sayHelloWorldFrom(@PathParam("from") String from) {
    String result = "Hello, " + from + ".";
    System.out.println(result);
    return result;
  }
}
