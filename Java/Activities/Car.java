package activties;

public class Car {
	String color;
	String transmission;
	int tyre;
	int make;
	int doors;

	Car() {
		tyre = 4;
		doors = 4;
	}

	public void displayCharacteristics() {
		System.out.println("Color : " + color);
		System.out.println("Transmission : " + transmission);
		System.out.println("Tyres : " + tyre);
		System.out.println("Make : " + make);
		System.out.println("Doors : " + doors);
	}

	public void accelerate() {
		System.out.println("Car is moving forward.");
	}

	public void brake() {
		System.out.println("Car has STopped.");
	}

}
