package homeWork;

public class LocalInstanceVarible4 {

	int i = 2;


	private void method(int j) {
		int i = 3;
		i++;
		System.out.println(i + j);
		System.out.println(this.i + j);
	}

	private static void method1(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		LocalInstanceVarible4 li = new LocalInstanceVarible4();
		li.method(4);
		method1(2);


	}

}
