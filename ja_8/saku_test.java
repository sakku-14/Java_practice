//equalsでオブジェクトの比較ができるのは確認した。要は、文字列のオブジェクト同士。ただ、オブジェクトであるインスタンス同士の比較はequalsではできなかった。というかfalseが返ってきてしまう。その要員追及をしたい。
//上の理由は、equalsは値を比較するため、s1.equals(s2)はアドレス値を比較してしまうからfalseが返ってくる。
public class saku_test {
	public static void main(String args[]) {
		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		Saku s1 = new Saku();
		Saku s2 = new Saku();
		Saku s3;
		s3 = s1;
		s1.print();
		s2.print();
		System.out.println(s1.s_out() == s2.s_out());
		System.out.println(s1.s_out().equals(s2.s_out()));
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
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
