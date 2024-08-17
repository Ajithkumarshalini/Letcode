package homeWork;

public class AxisBank implements RBI{

	public void panMandatory() {

		System.out.println("pan card is manadtory");
		System.out.println(UPILimit);
	}

	public void adharMandatory() {
		System.out.println("adhar card is manadtory");
		System.out.println(UPILimit);
	}

	public static void main(String[] args) {

		AxisBank ab = new AxisBank();
		ab.adharMandatory();
		ab.panMandatory();

	}

}
