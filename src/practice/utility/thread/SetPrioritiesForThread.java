package practice.utility.thread;

public class SetPrioritiesForThread extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {

		SetPrioritiesForThread t = new SetPrioritiesForThread();
		t.setPriority(10);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
