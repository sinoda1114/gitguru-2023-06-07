import javax.servlet.http.*;
import java.io.IOException;

public class XSSServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String comment = request.getParameter("comment");
        response.setContentType("text/html");

        // User's comment is directly included into HTML without any sanitization
        response.getWriter().print("<html><body>Your comment: " + comment + "</body></html>");
    }
}
