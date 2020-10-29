import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/discount")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price= Float.parseFloat(request.getParameter("price"));
        float percent= Float.parseFloat(request.getParameter("discount"));

            float amount= (float) (price*percent*0.01);


        float priceDiscount= (price-amount);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Discount Amount: " +amount+"</h2>");
        writer.println("<h2>Discount Price: " +priceDiscount+"</h2>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
