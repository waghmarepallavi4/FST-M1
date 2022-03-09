package activties;

public class Activity2 {

	public static void main(String[] args) {
		int[] array = { 10, 77, 10, 54, -11, 10, 12, 10, 12, 10 };

		int i, sum = 0;

		for (i = 0; i < array.length; i++) {
			int x = array[i];
			if (x == 10) {

				sum = sum + x;
			}
			System.out.println("Value of Element at " + (i + 1) + " position is : " + x);
			if (sum == 30) {
				break;
			}
		}
		System.out.println("Sum is equal to :" + sum);

	}

}
