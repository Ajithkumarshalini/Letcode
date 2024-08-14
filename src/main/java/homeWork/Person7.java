package homeWork;

public class Person7 {

	private void eat() {
		System.out.println("Non Static methods");

	}

	private static void sleep() {
		System.out.println("Static methods");
	}


	public static void main(String[] args) {
		Person7.sleep();
		sleep();
		Person7 res = new Person7();
		res.eat();
		

	}

}
