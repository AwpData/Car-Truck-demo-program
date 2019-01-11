import java.util.Random;

public class Truck extends Vehicle {
	static Random num = new Random();
	private String tailgate = "closed";

	public Truck(String VehicleName) {
		super(VehicleName, "T" + num.nextInt(1000));
	}

	@Override
	public int setSpeed(int num) {
		if (getVehicleOnOrOff().equals("stopped")) {
			System.out.println("Start the vehicle first!");
		} else {
			super.speed = num;
			if (num > 75) {
				System.out.println("Error, speed over 75, setting speed to 75.");
				super.speed = 75;
			} else {
				super.speed = num;
			}
			if (super.speed == 0) {
				System.out.println("Speed is 0, stopping car");
				super.setVehicleStatusOff();
			}
		}
		return super.speed = speed;
	}

	public void checkSpeed() {
		if (super.speed == 75 || super.speed > 75) {
			System.out.println("Error, speed over 75, setting speed to 75.");
			super.speed = 75;
		}
		if (super.speed == 0 && super.getVehicleOnOrOff().equals("started")) {
			System.out.println("Speed decreased to 0, vehicle is stopping");
			super.setVehicleStatusOff();
		}
	}

	public String openTailgate() {
		if (getVehicleOnOrOff().equals("started")) {
			System.out.println("Stop the vehicle first!");
			return tailgate;
		} else {
			if (tailgate.equals("open")) {
				System.out.println("Trunk is already open cannot open again");
			} else {
				System.out.println("Opening Tailgate on " + getVehicleName() + "...");
			}
			return tailgate = "open";
		}
	}

	public String closeTailgate() {
		if (getVehicleOnOrOff().equals("started")) {
			System.out.println("Stop the vehicle first!");
			return tailgate;
		} else {
			if (tailgate.equals("closed")) {
				System.out.println("Trunk is already closed cannot close again");
			} else {
				System.out.println("Closing Tailgate on " + getVehicleName() + "...");
			}
			return tailgate = "closed";
		}
	}

	@Override
	public String getVehicleStatus() {
		System.out.println(getVehicleName() + " license plate: " + getLicensePlate());
		System.out.println(getVehicleName() + " is currently " + getVehicleOnOrOff());
		System.out.println(getVehicleName() + " is going " + getSpeed());
		System.out.println("Tailgate is " + tailgate);
		return "";
	}

	@Override
	void getGasMileage() {
		System.out.println("Truck Gas Mileage: 20 MPG");
	}

	@Override
	void getMaxSpeed() {
		System.out.println("Truck Max Speed: 75 MPH");

	}

	@Override
	void getWeight() {
		System.out.println("Truck Weight: 2 tons");

	}
}
