public class Quiz implements Measurable
{
	private int score;
	private String name;
	
	/**
	    Constructs a quiz object with a score.
	    @param quizScore the entered quiz score
	 */
	 public Quiz(String studentName, int quizScore)
	 {
	    score = quizScore;
	    name = studentName;
	 }
	 
	 public double getMeasure()
	 {
	    return score;
	 }
}