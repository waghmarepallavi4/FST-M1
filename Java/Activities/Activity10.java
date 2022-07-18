import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> myList= new HashSet<>();
		myList.add("a");
		myList.add("b");
		myList.add("c");
		myList.add("d");
		myList.add("e");
		
		System.out.println(myList.size());
		
		myList.remove("a");
		
		if(myList.remove("f")) {
        	System.out.println("f removed from the Set");
        } else {
        	System.out.println("f is not present in the Set");
        }
		
		System.out.println(myList.contains("a"));
		
		System.out.println(myList);
		
	}

}
