public class ex9_1{
	public static void main(String args[]) {
/*
		Animal pet[] = new Animal[2];
		pet[0] = new Dog(3);
		pet[1] = new Cat(1);

		pet[0].walk();
		pet[0].bite();
		pet[1].walk();
		pet[1].scratch();
*/
		Dog gon = new Dog(3);
		Cat siro = new Cat(1);

		gon.walk();
		gon.bite();
		siro.walk();
		siro.scratch();
		//System.out.println(gon.age);
		gon.show();
	}
}

class Animal {
	//protectedにしないと継承先のクラスからメンバ変数にアクセスできない
	protected int age;

	public Animal(int age) {
		this.age = age;
	}

	public void walk() {
		System.out.println("歩く");
	}
}

class Dog extends Animal{
	public Dog(int age) {
		super(age);
	}

	public void bite() {
		System.out.println("犬は噛み付いた");
	}

	public void show() {
		System.out.println(this.age);
	}
}

class Cat extends Animal{
	public Cat(int age) {
		super(age);
	}

	public void scratch() {
		System.out.println("猫は引っ掻いた");
	}
}
