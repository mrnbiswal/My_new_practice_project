package practice.utility.thread;

public class ThreadImplementingRunnable implements Runnable {

	public void run() {
		System.out.println("Child thread");
	}

	public static void main(String[] args) {

		ThreadImplementingRunnable r = new ThreadImplementingRunnable();
		Thread t = new Thread(r);
		t.start();
		System.out.println("Main thread");
	}

}
