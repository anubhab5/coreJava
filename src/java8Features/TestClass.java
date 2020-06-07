package java8Features;

public class TestClass {

	public static void main(String[] args) {

		C c = new C();
		c.myMethod();
		
		A a = () -> System.out.println("Inside");
		a.myMethod();
	}

}
