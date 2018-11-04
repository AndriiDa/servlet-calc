package servlet;


import service.FreeMarker;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class ServletLogin extends HttpServlet {
  private final FreeMarker freeMarker;

  public ServletLogin(FreeMarker freeMarker) {
    this.freeMarker = freeMarker;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    freeMarker.render("login.html",new HashMap<String, Object>(){{put("name", "s");}}, resp);
  }
}
