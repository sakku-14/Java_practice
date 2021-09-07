public class about_class {
	public static void main(String args[]){
		Human man = new Human("Yuki", 29);
		man.introduce();
	}
}

class Human {
	private String name;
	private int age;

	public Human(String n, int a) {
		name = n;
		age = a;
	}

	public void introduce() {
		System.out.println("My name is " + name + " and age is " + age + ".");
	}
}
