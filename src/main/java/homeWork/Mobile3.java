package homeWork;

public class Mobile3 {

	private void headSet(String Wireless) {
		System.out.println("Trun on the bluetooth for " + Wireless);
	}

	private void charger() {

		System.out.println("Use the comapany charger only");
	}

	private void internet() {

		System.out.println("Turn on the internet before you start to using mobile");	}

	public static void main(String[] args) {
		Mobile3 mob = new Mobile3();
		mob.headSet("One plus");
		mob.charger();
		mob.internet();

	}

}
