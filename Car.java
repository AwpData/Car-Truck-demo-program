public class Car extends Vehicle {
	private String trunk = "Closed";

	public Car(String VehicleName) {
		super(VehicleName);
	}

	public String openTrunk() {
		if (trunk.equals("open")) {
			System.out.println("Trunk is already open cannot open again");
		} else {
			System.out.println("Opening Trunk on " + this.getVehicleName() + "...");
		}
		return trunk = "open";
	}

	public String closeTrunk() {
		if (trunk.equals("closed")) {
			System.out.println("Trunk is already closed cannot close again");
		} else {
			System.out.println("Closing Trunk on " + this.getVehicleName() + "...");
		}
		return trunk = "closed";
	}

	public String getVehicleStatus() {
		System.out.println(this.getVehicleName() + " is currently " + this.getVehicleOnOrOff());
		System.out.println(this.getVehicleName() + " is going " + this.getSpeed());
		System.out.println("Trunk is " + trunk);
		return "";
	}
}
