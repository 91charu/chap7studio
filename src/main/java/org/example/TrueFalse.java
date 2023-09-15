package org.example;

public class TrueFalse extends QuestionParent{
    private String correctAnswer;

    public TrueFalse(String question, String correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }


    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    @Override
    public boolean checkAnswer(String userAnswer) {
        // Check if the user's answer matches the correct answer, ignoring case differences
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public String makeQuestion() {
        return getQuestion() + "\nA) True\nB) False\n";
    }

    @Override
    public String toString() {
        return "TrueFalse{" +
                "correctAnswer='" + correctAnswer + '\'' +
                '}';
    }
}