package practice.utility;

public class AnyVehicle {
	public void  move() {
		System.out.println("any vehicle can move/implement");
	}

}

class Bike extends AnyVehicle{
	public void  move() {
		System.out.println("Bike can move");
	} 
}

class BikeFactory{
	public static void main(String[] args) {
		AnyVehicle av = new AnyVehicle();
		av.move();
	}
}
