package homeWork;

public class CallingAbstractClass extends AbstractClass{

	

	@Override
	void brother() {
		System.out.println("this is abstract method over riding to the other abstract class ");
	}
	
	public static void main(String[] args) {
		
		CallingAbstractClass call = new CallingAbstractClass();
		call.brother();
		call.father();
		call.mother();
		
	}
	

	
	
}
