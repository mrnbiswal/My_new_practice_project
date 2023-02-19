package practice.utility.modify.daily;

public class NumberModify {

	public void reverseNumber(int a) {
		int number = a;
		int rev = 0;
		for (int i = a; i != 0; i++) {
			// System.out.println(i);
			int z = a % 10;

			rev = rev * 10 + z;
			a = a / 10;
			//System.out.println(rev);
		}
		System.out.println(rev);
//		if (number == rev) {
//			System.out.println(rev);
//			
//		} else {
//			System.out.println(rev + " no. is the reverse number");
//		}
	}

	public static void main(String[] args) {
		int a = 4554;
		NumberModify nm = new NumberModify();
		nm.reverseNumber(a);
	}
}
