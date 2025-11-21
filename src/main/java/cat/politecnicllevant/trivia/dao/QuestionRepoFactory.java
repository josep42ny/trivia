package cat.politecnicllevant.trivia.dao;

public class QuestionRepoFactory {

    public static QuestionRepo assemble() {
        return new QuestionRepoRestImpl();
    }

}
