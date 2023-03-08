package practice.utility.thread;

public class RestartingThread extends Thread {

	public void run() {
		System.out.println("Created thread");
	}

	public static void main(String[] args) {
		RestartingThread restartThread = new RestartingThread();
		restartThread.start();
		System.out.println("Main thread");
		restartThread.start();
	}

}
