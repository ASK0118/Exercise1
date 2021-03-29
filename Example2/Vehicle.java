package Example2;

public class Vehicle {

	public static void main(String[] args) {
		String type = "";
		Motorcycle a = new Motorcycle();
		System.out.println("The brand of the motorcycle is " + a.Brand);
		System.out.println("The colour of the motorcycle is " + a.Colour);
		System.out.println("The model of the motorcycle is " + a.Model);
		a.disTravel();
		a.sport(type);
		a.cruising();

		Car z = new Car();
		type = "";
		System.out.println("The brand of the car is " + z.Brand);
		System.out.println("The colour of the car is " + z.Colour);
		System.out.println("The model of the car is " + z.Model);
		z.disTravel();
		z.sport(type);
		z.cruising();
	}

}
