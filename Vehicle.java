import java.util.Scanner;

abstract class Vehicle {
	abstract void getGasMileage();
	abstract void getMaxSpeed();
	abstract void getWeight();

	private String VehicleName;
	protected int speed;
	private String status = "stopped";
	private String LicensePlate;

	public Vehicle(String VehicleName, String LicensePlate) {
		this.VehicleName = VehicleName;
		this.LicensePlate = LicensePlate;
	}

	public String getVehicleStatus() {
		System.out.println(VehicleName + " license plate: " + LicensePlate);
		System.out.println(VehicleName + " is currently " + status);
		System.out.println(VehicleName + " is going " + speed + " MPH");
		return "";
	}

	public String setVehicleStatusOff() {
		return status = "stopped";
	}

	public String start() {
		if (status.equals("started")) {
			System.out.println("Vehicle has already been started");
		} else {
			System.out.println("Starting vehicle...");
		}
		return status = "started";
	}

	public String stop() {
		if (status.equals("stopped")) {
			System.out.println("Vehicle has already been stopped");
		} else {
			System.out.println("Stopping vehicle...");
			speed = 0;
		}
		return status = "stopped";
	}

	public String turn() {
		if (getVehicleOnOrOff().equals("stopped")) {
			System.out.println("Start the vehicle first!");
			return "failing to turn...";
		}
		return "turning...";
	}

	public int setSpeed(int num) {
		if (status.equals("stopped")) {
			System.out.println("Start the vehicle first!");
		} else {
			speed = num;
		}
		return speed;
	}

	public String getSpeed() {
		return speed + " MPH";
	}

	public int increaseSpeed(int num) {
		if (status.equals("stopped")) {
			System.out.println("Start the vehicle first!");
			return speed = 0;
		}
		return speed += num;
	}

	public int decreaseSpeed(int num) {
		if (status.equals("stopped")) {
			System.out.println("Start the vehicle first!");
			return speed = 0;
		}
		speed -= num;
		if (speed < 0) {
			return speed = 0;
		}
		return speed;
	}

	public static int getinput() {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		return num;
	}

	public String getVehicleName() {
		return VehicleName;
	}

	public String getVehicleOnOrOff() {
		return status;
	}

	public String getLicensePlate() {
		return LicensePlate;
	}

}
