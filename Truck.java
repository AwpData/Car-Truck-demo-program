import java.util.Random;

public class Truck extends Vehicle {
	static Random num = new Random();
	private String tailgate = "closed";

	public Truck(String VehicleName) {
		super(VehicleName, "T" + num.nextInt(1000));
	}

	@Override
	public int setSpeed(int num) {
		if (num > 75) {
			System.out.println("Error, speed over 75, setting speed to 75.");
			super.speed = 75;
		} else {
			super.speed = num;
		}
		return super.speed = speed;
	}

	public void checkSpeed() {
		if (super.speed == 75 || super.speed > 75) {
			System.out.println("Error, speed over 75, setting speed to 75.");
			super.speed = 75;
		}
	}

	public String openTailgate() {
		if (tailgate.equals("open")) {
			System.out.println("Trunk is already open cannot open again");
		} else {
			System.out.println("Opening Tailgate on " + getVehicleName() + "...");
		}
		return tailgate = "open";
	}

	public String closeTailgate() {
		if (tailgate.equals("closed")) {
			System.out.println("Trunk is already closed cannot close again");
		} else {
			System.out.println("Closing Tailgate on " + getVehicleName() + "...");
		}
		return tailgate = "closed";
	}

	@Override
	public String getVehicleStatus() {
		System.out.println(getVehicleName() + " license plate: " + getLicensePlate());
		System.out.println(getVehicleName() + " is currently " + getVehicleOnOrOff());
		System.out.println(getVehicleName() + " is going " + getSpeed());
		System.out.println("Tailgate is " + tailgate);
		return "";
	}
}
