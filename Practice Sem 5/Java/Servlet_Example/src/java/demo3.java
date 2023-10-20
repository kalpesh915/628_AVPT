
import java.io.IOException;
import javax.servlet.*;

public class demo3  extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        
        res.getWriter().print("<html><body>");
        res.getWriter().print("<h1>Welcome to wolrd of Servlet with Genric Servlet</h1>");
        res.getWriter().print("</body></html>");
    }
}
