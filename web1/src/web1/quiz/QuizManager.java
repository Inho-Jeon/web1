package web1.quiz;

import java.util.ArrayList;
import java.util.List;

public class QuizManager {
	
	private List<QuizVO> quizlist;
	
	public QuizManager() {
		quizlist = new ArrayList<>();
		
		for (int i = 1; i < 11; i++) {
			quizlist.add(new QuizVO(i+"문제","1","1","2","3","4"));
		}
	}
	
	public QuizVO getNext(int qno, String answer) {
		
		if(qno == 0 ) {
			return quizlist.get(0);
		}
		
		if(quizlist.get(qno).checkAnswer(answer)){
			return quizlist.get(qno+0);
			
		}else {
			return null;
		}
		
	}
	
	
	
}
