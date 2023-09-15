package org.example;


public abstract class QuestionParent {
    private static int idCounter=1;
    private int id=0;
    private String question;

    public QuestionParent( String question) {
        this.id = idCounter++;
        this.question = question;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        QuestionParent.idCounter = idCounter;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public abstract String makeQuestion();
    public abstract boolean checkAnswer(String userAnswer);

    public abstract String getCorrectAnswer();

}