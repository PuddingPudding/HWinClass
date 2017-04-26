
public class LCMnumber
{
	public int LCM(int x , int y) throws WrongNumberException 
	{
		int output = 1;
		if(x <= 0 || y <= 0)
		{
			throw new WrongNumberException();
		}
		else
		{
			output = Math.max(x, y);
			while(output % x != 0 || output % y != 0)
			{
				output++;
			}
		}
		return output;
	}
}