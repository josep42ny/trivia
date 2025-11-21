package cat.politecnicllevant.trivia.dao;

import cat.politecnicllevant.trivia.model.Question;
import cat.politecnicllevant.trivia.model.QuestionDto;

import java.util.List;

public interface QuestionRepo {

    public List<Question> get(int amount);

}
