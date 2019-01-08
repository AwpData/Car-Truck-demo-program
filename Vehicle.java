import java.util.Scanner;
public class Vehicle {
	private String VehicleName;
	private int speed;
	private String status = "stopped";
	public Vehicle(String VehicleName) {
		this.VehicleName = VehicleName;
	}
	public String getVehicleStatus() {
		System.out.println(VehicleName + " is currently " + status);
		System.out.println(VehicleName + " is going " + speed + " MPH");
		return "";
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
		}
		return status = "stopped";
	}
	public String turn() {
		return "turning...";
	}
	public int setSpeed(int num) {
		speed = num;
		return speed;
	}
	public String getSpeed() {
		return speed + " MPH";
	}
	public int increaseSpeed(int num) {
		return speed += num;
	}
	public int decreaseSpeed(int num) {
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
	public int getVehicleSpeed() {
		return speed;
	}
}
