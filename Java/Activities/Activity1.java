package activties;

public class Activity1 {

	public static void main(String[] args) {
		
		Car a = new Car();
		a.make = 2014;
		a.color = "Black";
		a.transmission = "Manual";
		
		a.displayCharacteristics();
		a.accelerate();
		a.brake();
	}

}
