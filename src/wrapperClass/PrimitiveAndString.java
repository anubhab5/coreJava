package wrapperClass;

public class PrimitiveAndString {
	public static void main(String[] args) {

		byte x = 100;
		String s = Byte.toString(x); // to convert a primitve type to string
		Byte aa1 = Byte.parseByte(s); // To convert a String to byte
		byte aa2 = Byte.parseByte(s);
		
		int intVal = 200;
		String str = Integer.toString(intVal);
		Byte b = Byte.parseByte(str);
		System.out.println(b);
		
	}
}
