package practice.utility.modify.daily;

public class SecondThreadClass extends Thread {
	public void start() {
		super.start();
		System.out.println("Start Method");
	}

	public void run() {
		System.out.println("Run Method");
	}

	public static void main(String[] args) {
		SecondThreadClass thread2 = new SecondThreadClass();
		thread2.start();
		System.out.println("Main Thread");
		System.out.println(Thread.activeCount());
	}

}
