public class const_test {
	public static void main(String args[]) {
		CTest c1 = new CTest();
		CTest c2 = new CTest(5);
		CTest c3 = new CTest(9, 8);
		CTest c4 = new CTest(10, 20);
		
		c1.print();
		c2.print();
		c3.print();
		c4.print();

		System.out.println(c1 == c4);
		System.out.println(c1.equals(c4));
	}
}

class CTest {
	private int a;
	private int b;

	public CTest() {
		this(10, 20);
	}

	public CTest(int a) {
		this(a, 20);
	}

	public CTest(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void print() {
		System.out.println(this.a + ", " + this.b);
	}
}
