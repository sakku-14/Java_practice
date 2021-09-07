public class about_class {
	public static void main(String args[]){
		Human man = new Human("Yuki", 29);
		man.introduce();
		man.setAge(6);
		System.out.println(man.getAge());
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

	public void setAge(int a) {
		if (a < 0) {
			age = 0;
		}
		else {
			age = a;
		}
	}

	public int getAge() {
		return (age);
	}
}
