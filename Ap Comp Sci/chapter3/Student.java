
public class Student
{
	String name;
	int score;
	double average;
	int quizN;
	
	public Student(String str)
	{
		this.name = str;
		this.quizN = 0;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getTotalScore()
	{
		return this.score;
	}
	
	public double getAverageScore()
	{
		return this.average;
	}
	
	public void addQuiz(int score)
	{
		this.quizN += 1;
		this.score += score;
		this.average = this.score / this.quizN;
	}
}
