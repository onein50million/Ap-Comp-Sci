package p3point4;
/**
 * 
 * Keeps track of student scores
 *
 */
public class Student
{
	private String name;
	private double score;
	private double average;
	private int quizN;
	
	/**
	 * Creates a new student
	 * @param name Student's name
	 */
	public Student(String name)
	{
		this.name = name;
		this.quizN = 0;
	}
	
	/**
	 * Returns the student's name
	 * @return the student's name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Returns the student's total score
	 * @return the sum of all test scores
	 */
	public double getTotalScore()
	{
		return this.score;
	}
	
	/**
	 * Return's the student's average score
	 * @return the average score over all tests
	 */
	public double getAverageScore()
	{
		return this.average;
	}
	
	/**
	 * Adds a quiz to the student's score and updates Student.average and Student.score
	 * @param score the score the student received on the test
	 */
	public void addQuiz(double score)
	{
		this.quizN += 1;
		this.score += score;
		this.average = (double) this.score / this.quizN;
	}
}
