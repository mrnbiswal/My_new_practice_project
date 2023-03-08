package practice.utility.thread;

public class ThreadMethodsTest extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ThreadMethodsTest t = new ThreadMethodsTest();
		System.out.println(t.getName());
		Thread.currentThread().setName("Manoranjan");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10 / 0);
	}

}
