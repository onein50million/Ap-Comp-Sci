
public class P3point4
{

	public static void main(String[] args)
	{
		Student student = new Student("George");
		System.out.println(student.getName());
		student.addQuiz(95);
		student.addQuiz(90);
		student.addQuiz(87);
		student.addQuiz(93);
		System.out.println(student.getTotalScore());
		System.out.println(student.getAverageScore());
	}

}
