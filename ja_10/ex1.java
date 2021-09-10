public class ex1 {
	public static void main(String args[]) {
		Ex10_01 ex = new Ex10_01();
		ex.b();
	}
}

interface N {
	int N = 10;

	void b();
}

class Ex10_01 implements N {
	public void b() {
		System.out.println("Ex10_01クラスより");
	}
}
