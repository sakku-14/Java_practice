public class ab_array {
	public static void main(String args[]) {
		Obj arr[] = new Obj[3];
		arr[0] = new Obj();
		arr[1] = new Obj();
		arr[0].a = 10;
		arr[1].a = 20;
		System.out.println(arr[0].a);
		System.out.println(arr[1].a);
	}
}

class Obj {
	public int a;
}
