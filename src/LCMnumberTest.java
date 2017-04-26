import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class LCMnumberTest
{
	LCMnumber testObj;
	@BeforeClass
	public static void beforeClassTest()
	{
		System.out.println("Test Start");
	}
	
	@Before
	public void runBeforeAnyTest()
	{
		testObj = new LCMnumber();
		System.out.println("Before");
	}
	@Test
	public void testLCM()
	{
		try
		{
			assertEquals(9 , testObj.LCM(3, 9) );
		} catch (WrongNumberException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(expected = WrongNumberException.class)
	public void testLCM2() throws WrongNumberException
	{
			Object expected = new WrongNumberException();
			assertEquals(expected  , testObj.LCM(-5, 9) );
		
	}
	@Test
	public void testLCM3()
	{
		try
		{
			assertEquals(42 , testObj.LCM(3, 14) );
		} catch (WrongNumberException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
