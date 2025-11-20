package cat.politecnicllevant.trivia.controllers;

import java.io.*;
import java.util.List;

import cat.politecnicllevant.trivia.model.Question;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;

@WebServlet(name = "gameServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Client client = ClientBuilder.newClient();
        List<Question> name = client.target("https://the-trivia-api.com/v2/")
                .path("questions")
                .queryParam("difficulties", "easy")
                .queryParam("tags", "alcohol")
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<>(){});
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + name + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}