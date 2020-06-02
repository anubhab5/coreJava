package Collections.NavigableTreeSetDemo;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> s = new TreeSet<Integer>();

		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);

		System.out.println(s);

		// Ceiling: returns Lowest element greater than or equal to the one passed
		System.out.println("Ceiling:- " + s.ceiling(5));

		// Higher:- returns the lowest element greater than the one passed
		System.out.println("Higher:- " + s.higher(7));

		// Floor returns the highest element which is less than or equal to the element
		// passed
		System.out.println("Floor:- " + s.floor(5));

		// Lower returns the highest element which is less than the element passed
		System.out.println("Lower:- " + s.lower(7));

		// Retrieves and removes the first element or return null if list is empty
		System.out.println("PollFirst:-  " + s.pollFirst());

		// Retrieves and removes the last element or return null if list is empty
		System.out.println("Poll Last:- " + s.pollLast());

		// sorts in descending order
		System.out.println("Descending Order:- " + s.descendingSet());

		System.out.println(s);

	}

}
