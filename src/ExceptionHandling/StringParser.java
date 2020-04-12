package ExceptionHandling;

public class StringParser {

	public static void main(String[] args) {
		String str = "abcd";

		try {
			int i = Integer.parseInt(str);
			System.out.println(i); // Number Format Exception
		} catch (NumberFormatException e) {
			System.out.println("Improper Conversion.");
		}
	}
}

/*
 * Exception in thread "main" java.lang.NumberFormatException: For input string:
 * "abcd" at
 * java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * at java.lang.Integer.parseInt(Integer.java:580) at
 * java.lang.Integer.parseInt(Integer.java:615) at
 * ExceptionHandling.StringParser.main(StringParser.java:7) *
 *
 */
