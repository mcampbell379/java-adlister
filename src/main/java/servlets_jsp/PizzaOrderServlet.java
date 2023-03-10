package servlets_jsp;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        request.getRequestDispatcher("/servlets_jsps/pizzOrder.jsp").forward();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
