package stringDemo;

public class StringCreationDemo {

	public static void main(String[] args) {
		String s1 = "This is String";
		String s2 = new String("String using string obj");
		char c[] = { 'a', 'b', 'c' };
		String s3 = new String(c);
		byte b[] = { 65, 66, 67 };
		String s4 = new String(b);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
