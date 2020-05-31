package arraysDemo;

public class ArrayDemo {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };

		int arr1[] = new int[5];
		arr1[0] = 10;

		// Looping array using for
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}

		// forEach
		for (int item : arr1) {
			System.out.println(item);
		}

	}

}
