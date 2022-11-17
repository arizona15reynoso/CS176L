public class Quiz implements Measurable
{
	private int score;
	
	/**
	    Constructs a quiz object with a score.
	    @param quizScore the entered quiz score
	 */
	 public Quiz(int quizScore)
	 {
	    score = quizScore;
	 }
	 
	 public double getMeasure()
	 {
	    return score;
	 }
}