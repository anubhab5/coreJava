package ExceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {

		try {
			String input = args[0];
			System.out.println("Input is: " + input);
			int output = Integer.parseInt(input);
			System.out.println("Output is: " + output);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No Value Passed.");
		} catch (NumberFormatException e) {
			System.out.println("In-Correct Format Passed");
		}

		System.out.println("More Code");
	}
}
