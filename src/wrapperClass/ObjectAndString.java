package wrapperClass;

public class ObjectAndString {

	public static void main(String[] args) {
		long x = 1000; // primitive type
		Long y = Long.valueOf(x); // primitive to Object

		String str = y.toString(); // object to string
		Long z = Long.valueOf(str); // string to object
	}
}
