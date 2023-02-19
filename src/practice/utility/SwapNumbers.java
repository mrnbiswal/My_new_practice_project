package practice.utility;

public class SwapNumbers {

	public static void swap(int a, int b) {
		b = b + a;
		a = b - a;
		b = b - a;

	}

	public static void main(String[] args) {
		int a = 10;
		int b = 29;
		swap(a, b);
		System.out.printf("a is %d, b is %d", a, b);

	}

}
