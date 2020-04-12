package polymorphism;

public class CompileTimeBinding {

	void add(int a, int b) {
		System.out.println("Int Result is " + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("Int 3 param Result is " + (a + b + c));
	}

	void add(float a, float b) {
		System.out.println("Float Result is " + (a + b));
	}

	public static void main(String[] args) {
		CompileTimeBinding obj = new CompileTimeBinding();
		obj.add(5, 10);
		obj.add(5, 20, 50);
		obj.add(10f, 20f);
	}
}
