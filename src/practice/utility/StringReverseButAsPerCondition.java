package practice.utility;

public class StringReverseButAsPerCondition {

	public void Iteration(String s) {

		char[] c = s.toCharArray();

		int i;
		for (i = 0; i < c.length; i++)

		{
			System.out.println(c[i]);
		}

		//return c[i];
	}

	public static void main(String[] args) {

		String s = "Manoranjan";
		StringReverseButAsPerCondition strrev = new StringReverseButAsPerCondition();
		strrev.Iteration(s);

	}

}
