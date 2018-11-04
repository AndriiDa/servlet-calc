package servlet;


import service.FreeMarker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class ServletLogout extends HttpServlet {
  private FreeMarker freeMarker;

  public ServletLogout(FreeMarker freeMarker) {
    this.freeMarker = freeMarker;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    freeMarker.render("logout.html",new HashMap<String, Object>(), resp);
  }
}
