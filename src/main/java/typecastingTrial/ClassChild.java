package typecastingTrial;

public class ClassChild extends ClassParent {

	public int divide(int a, int b) {
		int result = a / b;
		System.out.println("Result of division is :" + result);
		return result;
	}

	public void parentmethod() {

		System.out.println("Parent method overloaded");

	}

}
