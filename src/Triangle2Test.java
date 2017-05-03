import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle2Test
{
	Triangle2 t;
	
	@BeforeClass
	public static void beforeClassTest()
	{
		System.out.println("Test Start");
	}
	
	@Before
	public void runBeforeAnyTest()
	{
		t = new Triangle2();
		System.out.println("Before");
	}
	
	@Test
	public void testCheckTriangle2()
	{
		assertEquals("正三角形", t.checkTriangle(11, 11, 11));
	}
	
	@Test
	public void testCheckTriangle3()
	{
		assertEquals("等腰三角形", t.checkTriangle(7, 11, 11));
	}
	
	@Test
	public void testCheckTriangle4()
	{
		assertEquals("長度不可以是負的", t.checkTriangle(-11, 11, 11));
	}
	@Test
	public void testCheckTriangle5()
	{
		assertEquals("長度不可以是負的", t.checkTriangle(11, -11, 11));
	}
	@Test
	public void testCheckTriangle6()
	{
		assertEquals("長度不可以是負的", t.checkTriangle(11, 11, -11));
	}
	
	@Test
	public void testCheckTriangle7()
	{
		assertEquals("非三角形", t.checkTriangle(1, 2, 3));
	}
	
	@After
	public void runAfterAnyTest()
	{
		t = null;
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClassTest()
	{
		System.out.println("AfterClass");
	}
}
