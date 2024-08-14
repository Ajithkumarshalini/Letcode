package homeWork;

public class Person6 {
	static int y = 0;

	private void methods() {
		int x = 0;
		x++;
		y++;
		System.out.println(x + "--" + y);

	}

	public static void main(String[] args) {
		Person6 res = new Person6();
		res.methods();
		res.methods();
		res.methods();
	}

}
