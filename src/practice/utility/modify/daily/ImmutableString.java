package practice.utility.modify.daily;

public class ImmutableString {

	public static void main(String[] args) {

		String s = new String("manoranjan");
		String s1 = "manoranjan";
		String s4 = new String("manoranjan");
		String s2 = s1 + "Biswal";
		String s3 = s.concat(s);

		System.out.println(s.equals(s4));
		System.out.println(s == s4);

		System.out.println(s.equals(s1));
		System.out.println(s == s2);

		System.out.println(s2.equals(s3));
		System.out.println(s2 == s3);

		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

	}

}
