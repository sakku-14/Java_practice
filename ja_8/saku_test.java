//equalsでオブジェクトの比較ができるのは確認した。要は、文字列のオブジェクト同士。ただ、オブジェクトであるインスタンス同士の比較はequalsではできなかった。というかfalseが返ってきてしまう。その要員追及をしたい。

public class saku_test {
	public static void main(String args[]) {
		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		Saku s1 = new Saku();
		Saku s2 = new Saku();
		s1.print();
		s2.print();
		System.out.println(s1.s_out() == s2.s_out());
		System.out.println(s1.s_out().equals(s2.s_out()));
	}
}

class Saku {
	private String a;
	private String b;

	public Saku() {
		this.a = "hello";
		this.b = "hello";
	}

	public void print() {
		System.out.println(a + ":" + b);
	}

	public String s_out() {
		return (this.a);
	}
}
