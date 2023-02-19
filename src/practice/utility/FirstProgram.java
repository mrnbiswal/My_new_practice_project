package practice.utility;

public class FirstProgram {

	public static void main(String[] args) {
		String str = "Automation";
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1 = str1.reverse();
		System.out.println("Reverse Number :" + str1);
	}

} 
