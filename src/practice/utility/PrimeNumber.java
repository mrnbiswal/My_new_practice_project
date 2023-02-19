package practice.utility;

public class PrimeNumber {

	public static boolean primeCheck(int a) {
		if ((a == 0) || (a == 1)) {
			return false;
		}
		if (a == 2) {
			return true;
		}
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(primeCheck(9));
		System.out.println(primeCheck(18));
		System.out.println(primeCheck(5));
		System.out.println(primeCheck(7));
	}

}
