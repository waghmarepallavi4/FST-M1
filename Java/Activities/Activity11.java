import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> myList= new HashMap<Integer, String>();
		myList.put(1, "violet");
		myList.put(2, "blue");
		myList.put(3, "cyan");
		myList.put(4, "dark red");
		myList.put(5, "elec green");
		
		System.out.println(myList.size());
		
		System.out.println(myList);
		
		myList.remove(1);
		myList.remove(3, "cyan");
		System.out.println(myList.containsKey(5));
		System.out.println(myList.containsValue("elec green"));
		
		System.out.println(myList.size());
			
	}

}
