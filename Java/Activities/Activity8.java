class CustomException extends Exception {

	private String message ;

	public CustomException(String a) {

		this.message = a;


	}

	@Override
	public String getMessage() {
		return message;

	}
}


public class Activity8 {



	public static void main(String[] args) {

		try {
			Activity8.exceptionTest(null);
		} catch (CustomException e) {
			e.printStackTrace();
		}

	}

	private static void exceptionTest(String string) throws CustomException {
		if (string == null) {
			throw new CustomException("String Value is Null");
		}
		else {
			
			System.out.println(string);
		}
	}
}



