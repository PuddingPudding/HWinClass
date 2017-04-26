
public class Stack
{
	int[] numbers = new int[5];
	int nowPointer = 0;
	
	public boolean push(int input)
	{
		if(this.isFull() )
		{
			System.out.println("已經滿了");
			return false;
		}
		else
		{
			numbers[nowPointer] = input;
			nowPointer++;
			System.out.println("成功塞入");
			return true;
		}
	}
	public int pop()
	{
		if(this.isEmpty() )
		{
			System.out.println("空了");
			return 0;
		}
		else
		{
			nowPointer--;
			return numbers[nowPointer+1];
		}
	}
	public boolean isFull()
	{
		return (nowPointer+1 >= numbers.length);
	}
	public boolean isEmpty()
	{
		return (nowPointer == 0);
	}
}
