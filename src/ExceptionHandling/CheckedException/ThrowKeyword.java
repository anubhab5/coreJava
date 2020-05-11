package ExceptionHandling.CheckedException;

public class ThrowKeyword {

	public static void main(String[] args) {

		// Using throw keyword we can create any Runtime Exception or any checked exception
		/*
		 * // We can create a new Exception with the keyword throw throw new
		 * 
		 */
//		throw new RuntimeException("Some Custom Error.");
		
		try {
			throw new Exception("Funds Not Available");
		} catch (Exception e) {
			System.out.println("New Exception Thrown Catch block");
		}

	}
}
