package wrapperClass;

public class AllInOne {

	public static void main(String[] args) {

		int x = 100; // Defining an integer value
		String y = Integer.toString(x); // Converting Integer to String
		Integer b = new Integer(y); // Converting String to Integer
		int z = b.intValue(); // Converting Integer Object to Primitive type
		Integer c = new Integer(z); // Converting primitive int to Integer Object
		String d = c.toString(); // Converting Integer Object to string
		int e = Integer.parseInt(d); // Converting String to primitive int

	}

}
