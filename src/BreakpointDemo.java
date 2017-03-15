/*
 * 這是一個有錯的程式，請利用 breakpoint 來除錯
 */
public class BreakpointDemo {

	public static void main(String[] args) {
		int total = 7;
		int people = 2;
		double avg = total / people;
		int std = 3;

		int money = 1000;
		if (avg - std <= 0)
			money += 100;
		else
			money -= 100;
		// what is the value of money?
		System.out.println(money);
		
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println(i);
		}
	}
}
