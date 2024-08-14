package homeWork;

public class Car2 {



	int a = 1;
	int b = 2;

	private boolean acceltor() {
		return true;
	}

	private String brake() {
		return "Ajith";
	}

	private void cluth() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Car2 MyCar = new Car2();
		MyCar.acceltor();
		MyCar.brake();
		MyCar.cluth();


	}

}
