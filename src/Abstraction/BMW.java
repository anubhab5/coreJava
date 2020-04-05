package Abstraction;

/*
 * Instance of abstract class cannot be created
 * Abstract class can have a main method or a static method
 */

/*
 *  1. Whether abstract class can be marked as final or not 
 *  		=> Either a class can be marked as final or abstract
 *  		=> If we mark a class as final then the class cannot be inherited
 *  
 *  2. Can we mark an abstract method static
 *  		=> No. What ever methods are made abstract, 
 *  		   such implementation must be provided in child class
 *  
 *  3. Can we extend an abstract class and mark it as final
 *  		=> Yes
 */

public abstract class BMW {

	void commonFunc() {
		System.out.println("Some Common Fuctionality");
	}

	abstract void accelerate();

	public static void main(String[] args) {
		System.out.println("Inside main method");
	}
}
