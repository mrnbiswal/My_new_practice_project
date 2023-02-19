package practice.utility;

public class MethodOverloading {
	
	public void printing(String message) {
		System.out.println("PRINTING MESSAGE" +message);
	}
	public void printing() {
		System.out.println("PRINTING MESSAGE");
	}

	public int printing(int intValue) {
		System.out.println(intValue);
		return intValue;
	}

	public static void main(String[] args) {
		MethodOverloading overloadinf = new MethodOverloading();
		overloadinf.printing();
		overloadinf.printing(10);
		overloadinf.printing("sagar");
	}

}
