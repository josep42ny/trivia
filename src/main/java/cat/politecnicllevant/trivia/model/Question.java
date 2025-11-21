package cat.politecnicllevant.trivia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Data
public class Question {

    private String id;
    private String category;
    private String correctAnswer;
    private List<String> incorrectAnswers;
    private QuestionText question;
    private List<String> tags;
    private String type;
    private String difficulty;
    private List<String> regions;
    private boolean isNiche;

    public String getQuestionText() {
        return question.getText();
    }

    @Data
    private static class QuestionText {
        private String text;
    }

}
