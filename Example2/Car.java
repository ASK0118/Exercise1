package Example2;

public class Car {
	String Brand = "Toyota";
	String Colour = "White";
	String Model = "Vios";

	void disTravel() {
		System.out.println("I drive car for distance travelling");
	}

	void sport(String type) {
		type = "One-make racing, Sports car racing, and Time Attack Series";
		System.out.println("The sport event for motorcycle are " + type);
	}

	void cruising() {
		System.out.println("I also drive car to cruise around");
	}
}
