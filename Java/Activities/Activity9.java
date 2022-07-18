import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList= new ArrayList<>();
		myList.add("a");
		myList.add("b");
		myList.add("c");
		myList.add("d");
		myList.add("e");
		
		for(String x:myList) {
			System.out.println(x);
		}
		
		String third = myList.get(2);
		System.out.println(third);
		System.out.println(myList.contains("a"));
		if(myList.contains("a")) {
			System.out.println("Mylist already contains "+"a");
		}
		else {
			System.out.println("MyList does not contains the name");
		}
		
		System.out.println("the total no. of elements in the MyList "+myList.size());
		
		myList.remove(4);
		
		System.out.println("the total no. of elements in the MyList "+myList.size());
		
	}

}
