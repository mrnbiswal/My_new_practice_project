package practice.utility;

public class Temp {
	private Temp(int data) {
		System.out.println("Something");
	}

	protected static Temp create(int data) {
		Temp obj = new Temp(data);
		return obj;
	}

	public void myMethod() {
		System.out.println("Anything");
	}
}
