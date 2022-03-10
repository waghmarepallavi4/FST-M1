package activties;

import java.util.Date;
import java.util.*;

class Plane {
	private List<String> passengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;

	Plane(int maxPassengers) {
		this.passengers = new ArrayList<>();
	}

	public void onboard(String passenger) {
		this.passengers.add(passenger);
	}

	public Date takeOff() {
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
	}

	public void land() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}

	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}

	public List<String> getPassengers() {
		return passengers;
	}
}

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		Plane plane = new Plane(10);
		plane.onboard("Pallavi");
		plane.onboard("Priyanka");
		System.out.println("Take off time is "+plane.takeOff()); 
		System.out.println("Passengers present are" + plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Landing Time is" + plane.getLastTimeLanded());
		
	}

}
