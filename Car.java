import java.util.Random;

public class Car extends Vehicle {
	static Random num = new Random();
	private String trunk = "closed";

	public Car(String VehicleName) {
		super(VehicleName, "C" + num.nextInt(1000));
	}

	@Override
	public int setSpeed(int num) {
		if (getVehicleOnOrOff().equals("stopped")) {
			System.out.println("Start the vehicle first!");
		} else {
			super.speed = num;
			if (num > 300) {
				System.out.println("Error, speed over 300, setting speed to 300.");
				super.speed = 300;
			} else {
				super.speed = num;
			}
			if (super.speed == 0) {
				System.out.println("Speed is 0, stopping car");
				super.setVehicleStatusOff();
			}
			if (super.speed > 59 && trunk.equals("open")) {
				System.out.println("Your fast speed caused your vehicle's trunk to close");
				System.out.println("Make sure to close it before driving");
				trunk = "closed";
			}
		}
		return super.speed = speed;
	}

	public void checkSpeed() {
		if (super.speed == 300 || super.speed > 300) {
			System.out.println("Error, speed over 300, setting speed to 300.");
			super.speed = 300;
		}
		if (super.speed == 0 && super.getVehicleOnOrOff().equals("started")) {
			System.out.println("Speed decreased to 0, vehicle is stopping");
			super.setVehicleStatusOff();
		}
	}

	public String openTrunk() {
		if (getVehicleOnOrOff().equals("started")) {
			System.out.println("Stop the car first!");
			return trunk;
		} else {
			if (trunk.equals("open")) {
				System.out.println("Trunk is already open cannot open again");
			} else {
				System.out.println("Opening Trunk on " + getVehicleName() + "...");
			}
			return trunk = "open";
		}
	}

	public String closeTrunk() {
		if (getVehicleOnOrOff().equals("started")) {
			System.out.println("Stop the vehicle first!");
			return trunk;
		} else {
			if (trunk.equals("closed")) {
				System.out.println("Trunk is already closed cannot close again");
			} else {
				System.out.println("Closing Trunk on " + getVehicleName() + "...");
			}
			return trunk = "closed";
		}
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
