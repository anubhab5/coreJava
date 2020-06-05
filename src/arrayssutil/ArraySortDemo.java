package arrayssutil;

import java.util.Arrays;
import java.util.List;

public class ArraySortDemo {

	public static void main(String[] args) {

		int[] arr = { 40, 10, 15, 7 };
		System.out.println("Before Sort:- ");
		for (int i : arr) {
			System.out.println(i);
		}
		Arrays.sort(arr);

		System.out.println("After Sort:- ");
		for (int i : arr) {
			System.out.println(i);
		}

		System.out.println(".................");
		System.out.println(".................");

		String[] str = { "c", "b", "a", "g", "o" };
		System.out.println("Before Sort:- ");
		for (String s : str) {
			System.out.println(s);
		}

		System.out.println(".................");

		// Normal Sort
		Arrays.sort(str);
		System.out.println("After Sort:- ");
		for (String s : str) {
			System.out.println(s);
		}

		System.out.println(".................");

		int binarySearch = Arrays.binarySearch(str, "g");
		System.out.println("Binary Search Result:- " + binarySearch);

		System.out.println(".................");

		// Custom Sort
		Arrays.sort(str, new MyComparator());
		System.out.println("After Sort:- ");
		for (String s : str) {
			System.out.println(s);
		}

		List<String> asList = Arrays.asList(str);
		System.out.println(asList);
	}

}
