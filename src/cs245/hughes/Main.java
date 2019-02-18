package cs245.hughes;

public class Main {

	public static void main(String[] args) {

		Quiz q;
		Quiz q2;
		float score;
		float score2;

		MCQuizQuestion q3 = new MCQuizQuestion("When was Coe College Founded");
		q3.addOption("1802", false);
		q3.addOption("1851", true);

		q = new Quiz();
		q.addQuestion(new QuizQuestion("What is the course number for this class? ", "CS245"));
		q.addQuestion(new QuizQuestion("True/False:  Polymorphism is also known as Early-Binding ", "False"));
		q.addQuestion(q3);
		q.addQuestion(new QuizQuestion("What is the ASCII value for \"A\"? ", "65"));
		q.addQuestion(new QuizQuestion("What is the value of Pi?", "3.14159"));


		q2 = q;

		//q.takeQuiz();
		//q2.takeQuiz();


		score = q.takeQuiz();
		System.out.println("Your score is " + score);
		score2 = q2.takeQuiz();
		System.out.println("Student 2 score is " + score2);


	}
}
