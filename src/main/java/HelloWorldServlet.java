import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        String message = "<h1>Hello, World!</h1>";

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        if(name != null) {
            message = "<h1>Hello " + name + "!</h1>";
        }

        out.println(message);
    }
}
