import java.util.Random;

public class Car extends Vehicle {
	static Random num = new Random();
	private String trunk = "Closed";

	public Car(String VehicleName) {
		super(VehicleName, "C" + num.nextInt(1000));
	}

	@Override
	public int setSpeed(int num) {
		if (num > 300) {
			System.out.println("Error, speed over 300, setting speed to 300.");
			super.speed = 300;
		} else {
			super.speed = num;
		}
		return super.speed = speed;
	}

	public void checkSpeed() {
		if (super.speed == 300 || super.speed > 300) {
			System.out.println("Error, speed over 300, setting speed to 300.");
			super.speed = 300;
		}
	}

	public String openTrunk() {
		if (trunk.equals("open")) {
			System.out.println("Trunk is already open cannot open again");
		} else {
			System.out.println("Opening Trunk on " + getVehicleName() + "...");
		}
		return trunk = "open";
	}

	public String closeTrunk() {
		if (trunk.equals("closed")) {
			System.out.println("Trunk is already closed cannot close again");
		} else {
			System.out.println("Closing Trunk on " + getVehicleName() + "...");
		}
		return trunk = "closed";
	}

	@Override
	public String getVehicleStatus() {
		System.out.println(getVehicleName() + " license plate: " + getLicensePlate());
		System.out.println(getVehicleName() + " is currently " + getVehicleOnOrOff());
		System.out.println(getVehicleName() + " is going " + getSpeed());
		System.out.println("Trunk is " + trunk);
		return "";
	}
}
