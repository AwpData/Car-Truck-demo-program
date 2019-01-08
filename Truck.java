public class Truck extends Vehicle {
	private String tailgate = "closed";

	public Truck(String VehicleName) {
		super(VehicleName);
	}

	public String openTailgate() {
		if (tailgate.equals("open")) {
			System.out.println("Trunk is already open cannot open again");
		} else {
			System.out.println("Opening Tailgate on " + this.getVehicleName() + "...");
		}
		return tailgate = "open";
	}

	public String closeTailgate() {
		if (tailgate.equals("closed")) {
			System.out.println("Trunk is already closed cannot close again");
		} else {
			System.out.println("Closing Tailgate on " + this.getVehicleName() + "...");
		}
		return tailgate = "closed";
	}

	public String getVehicleStatus() {
		System.out.println(this.getVehicleName() + " is currently " + this.getVehicleOnOrOff());
		System.out.println(this.getVehicleName() + " is going " + this.getSpeed());
		System.out.println("Tailgate is " + tailgate);
		return "";
	}
}
