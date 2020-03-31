package wrapperClass;

public class PrimitiveAndObject {

	public static void main(String[] args) {

		int x = 100;
		Integer y = Integer.valueOf(x); // valueOf converts primitive to OBJECT => BOXING
		int z = y.intValue(); // intValue converts OBJECT to primitive type => UNBOXING		
		System.out.println(y);
		
		// SIMILARLY OTHER CLASSES ARE FLOAT, BOOLEAN, DOUBLE, CHAR, LONG, BYTE
		Byte b = Byte.valueOf((byte)x);
		System.out.println(b);
	}
}
