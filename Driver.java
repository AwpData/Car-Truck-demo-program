import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		int num, carturns = 0, truckturns = 0;
		String choice = "hi";
		Scanner input = new Scanner(System.in);
		Car car = new Car("car"); // CHANGE TEXT IN QUOTATIONS
		Truck truck = new Truck("truck"); // CHANGE TEXT IN QUOTATION
		while (!choice.equals("14")) {
			System.out.println("What do you want to do?");
			System.out.println("1. Vehicle status");
			System.out.println("2. Start Vehicle  /  3. Stop Vehicle");
			System.out.println("4. Turn Vehicle");
			System.out.println("5. Set Speed  /  6. Get Speed");
			System.out.println("7. Increase Speed  /  8. Decrease Speed");
			System.out.println("9. Open Trunk  /  10. Close Trunk");
			System.out.println("11. Open Tailgate  /  12. Close Tailgate");
			System.out.println("13. Info on each vehicle");
			System.out.println("14. QUIT");
			choice = input.nextLine();
			System.out.println();
			if (choice.equals("1")) { // Checks all the statistics of the
										// vehicle
				car.getVehicleStatus();
				System.out.println("Number of turns: " + carturns);
				System.out.println();
				truck.getVehicleStatus();
				System.out.println("Number of turns: " + truckturns);
			}
			if (choice.equals("2")) { // START method
				System.out.println("Which vehicle?");
				System.out.println(car.getVehicleName() + ", " + truck.getVehicleName());
				choice = input.nextLine();
				if (choice.equals(car.getVehicleName())) {
					car.start();
				} else if (choice.equals(truck.getVehicleName())) {
					truck.start();
				}
			}
			if (choice.equals("3")) { // STOP method
				System.out.println("Which vehicle?");
				System.out.println(car.getVehicleName() + ", " + truck.getVehicleName());
				choice = input.nextLine();
				if (choice.equals(car.getVehicleName())) {
					car.stop();
				} else if (choice.equals(truck.getVehicleName())) {
					truck.stop();
				}
			}
			if (choice.equals("4")) { // TURN method
				System.out.println("Which vehicle?");
				System.out.println(car.getVehicleName() + ", " + truck.getVehicleName());
				choice = input.nextLine();
				if (choice.equals(car.getVehicleName())) {
					System.out.println(car.getVehicleName() + " is " + car.turn());
					if (!car.getVehicleOnOrOff().equals("stopped")) {
						carturns++;
					}
				} else if (choice.equals(truck.getVehicleName())) {
					System.out.println(truck.getVehicleName() + " is " + truck.turn());
					if (!truck.getVehicleOnOrOff().equals("stopped")) {
						truckturns++;
					}
				}
			}
			if (choice.equals("5")) { // sets the speed
				System.out.println("Which vehicle?");
				System.out.println(car.getVehicleName() + ", " + truck.getVehicleName());
				choice = input.nextLine();
				if (choice.equals(car.getVehicleName())) {
					System.out.println("What speed? ");
					num = Vehicle.getinput();
					car.setSpeed(num);
				} else if (choice.equals(truck.getVehicleName())) {
					System.out.println("What speed? ");
					num = Vehicle.getinput();
					if (num > 75) {
						truck.setSpeed(num);
					} else {
						truck.setSpeed(num);
					}
				}
			}
			if (choice.equals("6")) { // gets speed
				System.out.println(car.getVehicleName() + " is going " + car.getSpeed());
				System.out.println(truck.getVehicleName() + " is going " + truck.getSpeed());
			}
			if (choice.equals("7")) { // increases speed
				System.out.println("Which vehicle?");
				System.out.println(car.getVehicleName() + ", " + truck.getVehicleName());
				choice = input.nextLine();
				if (choice.equals(car.getVehicleName())) {
					System.out.println("How much are you increasing the speed? ");
					num = Vehicle.getinput();
					car.increaseSpeed(num);
					car.checkSpeed();
				} else if (choice.equals(truck.getVehicleName())) {
					System.out.println("How much are you increasing the speed? ");
					num = Vehicle.getinput();
					truck.increaseSpeed(num);
					truck.checkSpeed();
				}
			}
			if (choice.equals("8")) { // decreases speed
				System.out.println("Which vehicle?");
				System.out.println(car.getVehicleName() + ", " + truck.getVehicleName());
				choice = input.nextLine();
				if (choice.equals(car.getVehicleName())) {
					System.out.println("How much are you decreasing the speed? ");
					num = Vehicle.getinput();
					car.decreaseSpeed(num);
					car.checkSpeed();
				} else if (choice.equals(truck.getVehicleName())) {
					System.out.println("How much are you decreasing the speed? ");
					num = Vehicle.getinput();
					truck.decreaseSpeed(num);
					truck.checkSpeed();
				}
			}
			if (choice.equals("9")) {
				car.openTrunk();
			}
			if (choice.equals("10")) {
				car.closeTrunk();
			}
			if (choice.equals("11")) {
				truck.openTailgate();
			}
			if (choice.equals("12")) {
				truck.closeTailgate();
			}

			if (choice.equals("13")) { // Abstract methods
				System.out.println("Car Info:");
				car.getGasMileage();
				car.getMaxSpeed();
				car.getWeight();
				System.out.println();
				System.out.println("Truck Info:");
				truck.getGasMileage();
				truck.getMaxSpeed();
				truck.getWeight();
			}
			System.out.println();
		}
		System.out.println("Quitting program...");
	}
}
