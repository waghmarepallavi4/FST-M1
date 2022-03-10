package activties;

interface BicycleParts {

	public int gear = 0;
	public int speed = 0;

}

interface BicycleOperations {
	public void applyBrake(int decrement);

	public void speedUp(int increment);
}

 class Bicycle implements BicycleParts, BicycleOperations {
	public int gears;
	public int currentSpeed;

	public Bicycle(int gears, int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}

	public void applyBrake(int decrement) {
		currentSpeed -= decrement;
		System.out.println("Current speed: " + currentSpeed);
	}
	public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
    }

   
    public String bicycleDesc() {
        return("gears are "+ gears + "& Speed of bicycle: " + currentSpeed);
    }
}
 class MountainBike extends Bicycle{
	 int seatHeight;

	public MountainBike(int gears, int currentSpeed, int startHeight) {
		super(gears, currentSpeed);
		seatHeight = startHeight;
	}
	 public void setHeight(int newValue) {
	        seatHeight = newValue;
	    }

	    public String bicycleDesc() {
	        return (super.bicycleDesc()+ " Seat height: " + seatHeight);
	    }  
 }

public class Activity7 {

	public static void main(String[] args) {
		MountainBike a = new MountainBike(3, 0, 25);
        System.out.println(a.bicycleDesc());
        a.speedUp(20);
        a.applyBrake(5);

	}

}
