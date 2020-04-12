package ExceptionHandling;

public class ArrayIndexOOBDemo {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Elements inside the array are:- ");

		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}
		
		System.out.println("Some More Code");
	}

	void someNonStaticMethod() {
		System.out.println("inside non static method");
	}

}
/*
 * 1 2 3 4 5 Exception in thread "main"
 * java.lang.ArrayIndexOutOfBoundsException: 5 at
 * ExceptionHandling.ArrayIndexOOBDemo.main(ArrayIndexOOBDemo.java:10)
 * 
 */
