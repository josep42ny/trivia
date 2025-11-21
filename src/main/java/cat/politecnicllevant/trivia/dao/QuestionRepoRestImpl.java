package cat.politecnicllevant.trivia.dao;

import cat.politecnicllevant.trivia.model.Question;
import cat.politecnicllevant.trivia.model.QuestionDto;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

public class QuestionRepoRestImpl implements QuestionRepo {

    private final Client client;

    public QuestionRepoRestImpl() {
        this.client = ClientBuilder.newClient();
    }


    @Override
    public List<Question> get(int amount) {
        return client.target("https://the-trivia-api.com/v2/")
            .path("questions")
            .queryParam("difficulties", "easy")
            .queryParam("tags", "alcohol")
            .queryParam("limit", amount)
            .request(MediaType.APPLICATION_JSON)
            .get(new GenericType<>(){});
    }
}
