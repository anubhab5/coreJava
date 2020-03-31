package NonStaticMemberDemo;

public class CallingNonStaticMethod {

	int num; // Non-static member variable

	CallingNonStaticMethod() {
		// This is a constructor block
		// Does not have a return type
		// May or may not take arguments
		// Use to initialize members
		System.out.println("Inside the constructor");
	}

	{
		// Non-Static block
		System.out.println("Inside Non-Static block");
	}

	static {
		System.out.println("Inside static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside main method");
		CallingNonStaticMethod cnsm = new CallingNonStaticMethod(); // Creating an Object
		cnsm.doSomething();
	}

	void doSomething() {
		System.out.println("Inside Do Something");
	}
}
// Execution Flow
// First the main is being called
// The static block is called 
// Constructor is called

/*
 * Output Inside main method Inside Non-Static block Inside the constructor
 * 
 * 
 */
