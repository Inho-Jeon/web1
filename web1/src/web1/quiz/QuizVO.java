package web1.quiz;

import java.util.Arrays;

public class QuizVO {

	private String title;
	private String answer;
	private String [] options;
	
	
	
	public QuizVO(String title, String answer, String... options) {

		this.title = title;
		this.answer = answer;
		this.options = options;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String[] getOptions() {
		return options;
	}


	@Override
	public String toString() {
		return "QuizVO [title=" + title + ", answer=" + answer + ", options=" + Arrays.toString(options) + "]";
	}


	public void setOptions(String[] options) {
		this.options = options;
	}
	
	public boolean checkAnswer(String userAnswer) {
		return this.answer.equals(userAnswer);
	}
	
	
	
	
	
}
