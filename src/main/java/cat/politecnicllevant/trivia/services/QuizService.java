package cat.politecnicllevant.trivia.services;

import cat.politecnicllevant.trivia.dao.QuestionRepo;
import cat.politecnicllevant.trivia.dao.QuestionRepoFactory;
import cat.politecnicllevant.trivia.model.Question;
import cat.politecnicllevant.trivia.model.QuestionDto;

import java.util.Collections;
import java.util.List;

public class QuizService {

    private QuestionRepo repo;

    public QuizService() {
        this.repo = QuestionRepoFactory.assemble();
    }

    public List<QuestionDto> get() {
        return repo.get(1).stream().map(this::dtoOf).toList();
    }

    private QuestionDto dtoOf(Question question) {
        List<String> answers = question.getIncorrectAnswers();
        answers.add(question.getCorrectAnswer());
        Collections.shuffle(answers);

        return new QuestionDto(
                question.getQuestionText(),
                answers,
                question.getCorrectAnswer()
        );
    }

}
