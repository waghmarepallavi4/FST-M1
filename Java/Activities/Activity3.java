package activties;

public class Activity3 {
	public static void main(String[] args) {
		double seconds = 1000000000;

		double Earth = 31557600;
		double Mercury = 0.2408467;
		double Venus = 0.61519726;
		double Mars= 1.8808158;
		double Jupiter = 11.862615;
		double Saturn = 29.447498;
		double Uranus = 84.016846;
		double Neptune = 164.79132;
		
		double EY = seconds/Earth;
		
		System.out.println("Age in Earth :" + EY);
		System.out.println("Age in Mercury :" + EY/Mercury);
		System.out.println("Age in Venus :" + EY/Venus);
		System.out.println("Age in Mars :" + EY/Mars);
		System.out.println("Age in Jupi :" + EY/Jupiter);
		System.out.println("Age in Sat :" + EY/Saturn);
		System.out.println("Age in Uranus :" + EY/Uranus);
		System.out.println("Age in Neptune :" + EY/Neptune);
	}

}
