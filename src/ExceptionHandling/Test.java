package ExceptionHandling;

public class Test {

	static ArrayIndexOOBDemo a;

	public static void main(String[] args) {
		try {
			Test.a.someNonStaticMethod();
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}
	}
}
