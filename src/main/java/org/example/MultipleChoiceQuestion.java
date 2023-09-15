package org.example;

import java.util.Arrays;

public class MultipleChoiceQuestion extends QuestionParent {
    private String[] choices;
    private String correctAnswer;

    public MultipleChoiceQuestion(String question, String[] choices, String correctAnswer) {
        super(question);
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }


    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String makeQuestion() {

        return getQuestion() + "\nA) 2\nB) 4\nC) 6\nD) 8\n";
    }

    @Override
    public boolean checkAnswer(String userAnswer) {

        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    @Override
    public String toString() {
        return "MultipleChoiceQuestion{" +
                "choices=" + Arrays.toString(choices) +
                ", correctAnswer='" + correctAnswer + '\'' +
                '}';
    }

}
