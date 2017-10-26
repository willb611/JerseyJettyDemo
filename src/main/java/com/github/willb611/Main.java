package com.github.willb611;


import com.sun.jersey.spi.container.servlet.ServletContainer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


public class Main {
  private static final int SERVER_PORT = 9999;

  public static void main(String[] args) throws Exception {
    ServletHolder sh = new ServletHolder(ServletContainer.class);
    sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", "com.sun.jersey.api.core.PackagesResourceConfig");
    sh.setInitParameter("com.sun.jersey.config.property.packages", "com.github.willb611");//Set the package where the services reside
    sh.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");

    Server server = new Server(SERVER_PORT);
    ServletContextHandler context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
    context.addServlet(sh, "/*");
    server.start();
    server.join();
  }

}
