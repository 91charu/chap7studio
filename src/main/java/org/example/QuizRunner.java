package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class QuizRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<QuestionParent> questions = new ArrayList<>();
        questions.add(new MultipleChoiceQuestion("What is 2 + 2?", new String[]{" 3", " 4", " 5", " 6"}, "4"));
        questions.add(new TrueFalse("Is the sky blue?", "True"));
        // Display and generate questions
        for (QuestionParent question : questions) {
            System.out.println(question.makeQuestion());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.getCorrectAnswer() + "\n");
            }
        }
    }
}