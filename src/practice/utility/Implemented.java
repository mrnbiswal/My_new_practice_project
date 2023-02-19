package practice.utility;

public class Implemented extends Unimplemented1 {

	@Override
	void system() {
		System.out.println("Unimplemented class");

	}

	public static void main(String[] args) {

		Implemented im = new Implemented();
		im.sound();
		im.system();
		
	}

}
