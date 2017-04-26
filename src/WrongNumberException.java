
public class WrongNumberException extends Exception
{
	public WrongNumberException(String title)
	{
		super(title);
	}
	public WrongNumberException()
	{
		super("數字必須要大於0");
	}
}