import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(name = "PageCounterServlet", urlPatterns = "/counter")
public class PageCounterServlet extends HttpServlet {
    private int count = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        count++;
        if (Objects.equals(req.getParameter("reset"), "y")) {
            count = 0;
        }
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Visit Count: " + count + "</h1>");
    }
}