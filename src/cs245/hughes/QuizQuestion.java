package cs245.hughes;

import java.util.Scanner;

public class QuizQuestion {
    private String question;
    protected String correctAnswer;
//    private String studentAnswer;
//    private Scanner scan;

    public QuizQuestion(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        //  scan = new Scanner(System.in);
    }

    public void displayQuestion()
    {
        System.out.println(question);
        //studentAnswer = scan.nextLine();
    }


    public boolean isCorrect(String studentAnswer){
        return correctAnswer.equals(studentAnswer);
    }
}
