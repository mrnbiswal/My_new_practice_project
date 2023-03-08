package practice.utility.thread;

public class YieldThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
			Thread.yield();
		}
	}

	public static void main(String[] args) {

		YieldThread t = new YieldThread();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
