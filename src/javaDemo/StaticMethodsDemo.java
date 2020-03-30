package javaDemo;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		
	}

	static {
		System.out.println("in static block");
		StaticMethodsDemo.callStatic();
	}

	static int callStatic() {
		System.out.println("in static method");
		return 1;
	}

}
