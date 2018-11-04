import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import service.FreeMarker;
import servlet.ServletLogout;
import servlet.ServletLogin;
import servlet.ServletRedirectTo;

public class Application {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8080);
    FreeMarker freeMarker = new FreeMarker("templates");

    ServletContextHandler handler = new ServletContextHandler();

    handler.addServlet(new ServletHolder(new ServletLogin(freeMarker)), "/login");
    handler.addServlet(new ServletHolder(new ServletLogout(freeMarker)), "/logout");

    handler.addServlet(new ServletHolder(new ServletRedirectTo("/login")), "/*");


    server.start();
    server.join();

  }
}
