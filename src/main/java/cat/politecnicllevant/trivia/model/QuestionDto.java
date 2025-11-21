package cat.politecnicllevant.trivia.model;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class QuestionDto {

    @NonNull
    private String text;
    @NonNull
    private List<String> answers;
    @NonNull
    private String correctAnswer;

}
