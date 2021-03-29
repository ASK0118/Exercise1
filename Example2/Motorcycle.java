package Example2;

public class Motorcycle {
	String Brand = "Yamaha";
	String Colour = "Silver";
	String Model = "YZ450F";

	void disTravel() {
		System.out.println("I ride motorcycle for distance travelling");
	}

	void sport(String type) {
		type = "freestyle motocross, land speed, and hill climbs";
		System.out.println("The sport event for motorcycle are " + type);
	}

	void cruising() {

		System.out.println("I also ride motorcycle for cruising around\n");
	}
}
