
public class WrongGradeException extends Exception
{
	int wrongGrade;
	public WrongGradeException(int grade)
	{
		super("成績有誤，應該要界在0~100之間才對");
		this.wrongGrade = grade;
	}
	public int getGrade()
	{
		return this.wrongGrade;
	}
}
