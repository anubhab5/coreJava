package collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedListDemo {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();

		l.add("z");
		l.add("a");
		l.add("a");
		l.add("v");
		l.add("b");

		System.out.println("Before Sorting:- " + l);
		// Sorting using a custom sort
		 // Collections.sort(l, new MyComparator());
		Collections.sort(l);
		 System.out.println("After sorting:- " + l);
		int binarySearch = Collections.binarySearch(l, "a");
		System.out.println(binarySearch);
	}

}
