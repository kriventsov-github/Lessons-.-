package app.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=windows-1251");
        PrintWriter writer = resp.getWriter();
        writer.println("Тут произошло что-то подобное, только запрос был на <h2>'list'</h2>");
        writer.println("Сервелет сам у нас сейчас формирует ответ и заканчивает работу, сигнализируя Tomcat, что у него готов ответ клиенту. Tomcat же просто берет этот ответ и отправляет его назад клиенту.");
    }
}
