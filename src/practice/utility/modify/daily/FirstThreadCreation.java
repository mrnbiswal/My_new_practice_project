package practice.utility.modify.daily;

public class FirstThreadCreation extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread working");
		}
	}

	public static void main(String[] args) {

		FirstThreadCreation thread = new FirstThreadCreation();
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread working");
		}
	}

}
