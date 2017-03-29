import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		Add addTest = new Add();
		assertEquals(2 , addTest.getAdd(1,1) );
	}

}
