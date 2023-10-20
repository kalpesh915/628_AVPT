
import java.io.IOException;
import javax.servlet.*;

public class demo2 implements Servlet{

    private ServletConfig config;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servlet Configured");
    }

    @Override
    public ServletConfig getServletConfig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        
        ServletContext context = config.getServletContext();
        String ServletName = config.getServletName();
        
        res.getWriter().print("<html><body>");
        res.getWriter().print("<h1>Welcome to wolrd of Servlet with Interface</h1>");
        res.getWriter().print("</body></html>");
    }

    @Override
    public String getServletInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
