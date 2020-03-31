package NonStaticMemberDemo;

public class NonStaticMemberDemo {

	int num; // Non-static member variable

	NonStaticMemberDemo() {
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

	public static void main(String[] args) {
		System.out.println("Inside main method");
		new NonStaticMemberDemo(); // Creating an Object
	}
}
// Execution Flow
// First the main is being called
// The static block is called 
// Constructor is called

/*
 * Output 
 * Inside main method 
 * Inside Non-Static block 
 * Inside the constructor
 * 
 * 
 */
