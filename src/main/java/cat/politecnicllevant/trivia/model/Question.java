package cat.politecnicllevant.trivia.model;

import jakarta.persistence.Entity;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class Question {

    private String id;
    private String category;
    private String correctAnswer;
    private List<String> incorrectAnswers;
//    private Object question
//        : {
//        text: Which country is associated with the drink whisky?
//    },
    private List<String> tags;
    private String type;
    private String difficulty;
    private List<String> regions;
    private boolean isNiche;

}
