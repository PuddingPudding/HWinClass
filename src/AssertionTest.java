public class AssertionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssertionTest at = new AssertionTest();
		try {
			System.out.println(at.checkTriangle(10, 23, 11));
			System.out.println(at.checkTriangle(1, 1, 1));
			System.out.println(at.checkTriangle(2, 2, 3));
			System.out.println(at.checkTriangle(3, 2, 2));
			System.out.println(at.checkTriangle(0,-1,-2));
		} catch (Exception e) {
			TriangleException te = (TriangleException)e;
			System.out.println(te.getLengthString() );
			System.exit(0);
		}
	}

	public String checkTriangle(int a, int b, int c) throws Exception {
		if (a <= 0 || b <= 0 || c <= 0) {
			throw new TriangleException(a , b ,c);
		}
		assert a > 0 && b > 0 && c > 0;
		if (a + b > c && b + c > a && c + a > b) {
			if (a == b)
				if (b == c) {
					return "正三角形";
				} else
					return "等腰三角形";
			else if (b == c) {
				assert (a != b);
				return "等腰三角形";
			}
			assert (a != b);
			assert (a != c);
			assert (b != c);
			return "三角形";
		}
		return "非三角形";
	}
	
	class TriangleException extends Exception
	{
		int a;
		int b;
		int c;
		
		public TriangleException(int a , int b , int c)
		{
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		public String getLengthString()
		{
			return "a=" + this.a + " b=" + this.b + " c=" + this.c;
		}
	}
}