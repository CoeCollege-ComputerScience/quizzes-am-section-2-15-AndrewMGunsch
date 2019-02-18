package cs245.hughes;

import java.util.ArrayList;

public class MCQuizQuestion  extends QuizQuestion {

	ArrayList<String> options;

	public MCQuizQuestion(String question) {
		super(question, null);
		options = new ArrayList<String>();
	}

	public void addOption(String option, boolean isCorrect){
		options.add(options.size()+1 +". "+ option);

		if (isCorrect){
			correctAnswer = Integer.toString(options.size());
		}
	}

	@Override
	public void displayQuestion() {
		super.displayQuestion();
		for (String o: options){
			System.out.println("\t"+ o);
		}
	}

	@Override
	public boolean isCorrect(String studentAnswer) {
		int studentResponse;

		try{
			 studentResponse = Integer.parseInt(studentAnswer);
		}
		catch (NumberFormatException e){
			throw new InvalidAnswerException("Can't accept Letters");
		}

		if ((studentResponse < 1) || studentResponse > options.size()){
			throw new InvalidAnswerException("Invalid number option");
		}



		return super.isCorrect(studentAnswer);
	}
}
