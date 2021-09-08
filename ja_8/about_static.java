public class about_static {
	public static void main(String args[]) {
		NoStaticClass nsc = new NoStaticClass();
		nsc.a = 10;
		nsc.print();
		
		StaticClass.a = 20;
		StaticClass.print();
	}
}

class StaticClass{
	static int a;

	public static void print() {
		System.out.println("printメソッド実行" + a);
	}
}

class NoStaticClass{
	int a;

	public void print() {
		System.out.println("printメソッド実行" + a);
	}
}
