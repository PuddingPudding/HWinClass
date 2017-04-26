
public class Grade
{
	static double getGradeAverage(int[] input) throws WrongGradeException
	{
		int sum = 0;
		for (int i = 0; i < input.length; i++)
		{
			if (input[i] > 100 || input[i] < 0)
			{
				throw new WrongGradeException(input[i]);
			}
			sum += input[i];
		}
		return (double) sum / input.length;
	}

	public static void main(String args[])
	{
		int[] grades = { 5, 6, 3, 80 };
		double output = 0;
		try
		{
			output = getGradeAverage(grades);
		}
		catch (WrongGradeException e)
		{
			e.printStackTrace();
		}
		System.out.println(output);
	}
}
