package app.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=windows-1251");
        PrintWriter writer = resp.getWriter();
        writer.println("Томкат получил запрос на '/add' c методом GET, глянул в web.xml, направил на сервлет, и там метод GET его обработал, отдал в resp и браузер отобразил этот <h1>текст</h1>");
        writer.println("А мог бы и не отображать");
    }
}
