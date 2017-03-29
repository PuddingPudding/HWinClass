import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	//正三角形測試
	@Test
	public void testCheckTriangle() {
		Triangle t = new Triangle();
		assertEquals("正三角形", t.checkTriangle(11, 11, 11));		
	}

	//等邀三角測試
	@Test
	public void testCheckTriangle2() {
		Triangle t = new Triangle();
		assertEquals("等腰三角形", t.checkTriangle(11, 11, 10));
		assertEquals("等腰三角形", t.checkTriangle(11, 10, 11));		
		assertEquals("等腰三角形", t.checkTriangle(10, 11, 11));			
	}
	
	//一般三角測試
	@Test
	public void testCheckTriangle3() {
		Triangle t = new Triangle();
		assertEquals("一般三角形", t.checkTriangle(2,3,4));
		assertEquals("一般三角形", t.checkTriangle(5,4,3));
		assertEquals("一般三角形", t.checkTriangle(4,5,3));		
	}


}
