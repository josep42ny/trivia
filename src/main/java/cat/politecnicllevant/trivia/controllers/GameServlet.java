package cat.politecnicllevant.trivia.controllers;

import java.io.*;
import java.util.List;

import cat.politecnicllevant.trivia.model.Question;
import cat.politecnicllevant.trivia.model.QuestionDto;
import cat.politecnicllevant.trivia.services.QuizService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;

@WebServlet(name = "gameServlet", value = "/game")
public class GameServlet extends HttpServlet {
    private QuizService service;
    private String currentAnswer;
    private boolean result;

    public void init() {
        this.service = new QuizService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(result);

        QuestionDto question = service.get().getFirst();
        this.currentAnswer = question.getCorrectAnswer();

        req.setAttribute("question", question);
        req.getRequestDispatcher("game/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        result = req.getParameter("answer").equals(currentAnswer);
        doGet(req, resp);
    }

    public void destroy() {
    }
}