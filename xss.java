import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class XSSTestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String userComment = request.getParameter("comment");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>User Comments</h1>");
        out.println("<p>" + userComment + "</p>"); // This line could lead to XSS
        out.println("</body></html>");
    }
}
