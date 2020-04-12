package ExceptionHandling;

import java.util.Scanner;

public class Divison {

	public static void main(String[] args) {

		int a, b, c;

		System.out.println("Enter two Integers:- ");

		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		try {
			c = a / b;
			System.out.println("Result:- " + c);			
		} catch (ArithmeticException e) {
			System.out.println("Division By Zero NOT ALLOWED");
		}
		System.out.println("More code");
	}
}

/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandling.Divison.main(Divison.java:16)
	
 */
 