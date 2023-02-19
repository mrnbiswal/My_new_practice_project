package practice.utility.streamapi;

public class User {

	String name, emailId, mobileNumber;
	int rollNumber;

	public User(String name, String emailId, String mobileNumber, int rollNumber) {
		rollNumber = this.rollNumber;
		name = this.name;
		emailId = this.emailId;
		mobileNumber = this.mobileNumber;
		// System.out.println(rollNumber + "\n" + name + "\n" + emailId + "\n" +
		// mobileNumber);
	}

	public static void myUser(String name, String emailid, String mobileNumber, int rollNumber) {
		System.out.println(rollNumber + "\n" + name + "\n" + emailid + "\n" + mobileNumber);
		// System.out.println(emailid);
		// System.out.println();

	}

	public static void main(String[] args) {
		User.myUser("Manoranjan", "mrnbiswal95@gmail.com", "9348367258", 1);
		//User newUser = new User("Manoranjan", "mrnbiswal95@gmail.com", "9348367258", 1);
		//System.out.println(newUser);

	}
}
