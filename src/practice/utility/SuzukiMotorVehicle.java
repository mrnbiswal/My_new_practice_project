package practice.utility;

public class SuzukiMotorVehicle implements Vehicle{

	@Override
	public void stop() {
		System.out.println("SuzukiMotorVehicle STOP");
	}

	@Override
	public void start() {
		System.out.println("SuzukiMotorVehicle START");		
	}
	
	public String gearUp() {
		return "Gear already up";
	}

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveBackward() {
		// TODO Auto-generated method stub
		
	}


}
