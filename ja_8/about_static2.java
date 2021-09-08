public class about_static2 {
	public static void main(String args[]) {
		Sample test1 = new Sample(1, 2);
		Sample test2 = new Sample(3, 4);

		test1.put();
		test2.put();
		test1.func();
	}
}

class Sample {
	private int a;
	private static int b;
	private int value = 10;

	public Sample(int aa, int bb){
		a = aa;
		b = bb;
	}

	public void put() {
		System.out.println("a = " + a + " b = " + b);
	}
	public void func() {
		int value = 20;
		System.out.println("local: " + value);
		System.out.println("memba: " + this.value);
	}
}
