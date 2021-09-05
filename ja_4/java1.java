public class java1 {
	public static void main (String args[]) {
		int value1 = 20;
		System.out.println(value1);
		String str = "hello world";
		System.out.println(str);
		str = "good morning";
		System.out.println(str);
		System.out.println("Takeshi " + str);
		int[] arr = new int[3];
		arr[0] = 3;
		arr[1] = 4;
		arr[2] = 5;
		System.out.println(arr[0]);
		System.out.println(arr.length);
		int[][] arr2 = new int[2][3];
		arr2[1][2] = 5;
		System.out.println(arr2[1][2]);
	}
}
