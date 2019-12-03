import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;


public class MainServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp)
        throws IOException,ServletException {

        PrintWriter out = resp.getWriter();
        out.print("<h1>Serega, eto pisdec kakaya ZALUPA</h1>");

       // super.doGet(req,resp);
    }
    @Override
    protected  void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        super.doPost(req,resp);
    }

}
