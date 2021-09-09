public class ex8_1 {
	public static void main(String args[]) {
		Triangle triangle = new Triangle(3.5, 5.2);
		System.out.println(triangle.ans());
	}
}

class Triangle {
	private double base;
	private double height;

	public Triangle(double b, double h) {
		base = b;
		height = h;
	}

	public double ans(){
		return (this.base * this.height / 2);
	}
}
