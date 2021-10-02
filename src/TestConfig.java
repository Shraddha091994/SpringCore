import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestConfig extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out= resp.getWriter();
	
	ServletConfig cfg=getServletConfig();
	
	String v1=cfg.getInitParameter("value1");
	String v2=cfg.getInitParameter("value2");
	
	String name=cfg.getServletName();
	
	out.println("<br> value1 is = "+v1);
	out.println("<br> value2 is = "+v2);
	out.println("<br> servlet name is = "+name);


}
}
