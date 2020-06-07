package java8Features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			l.add(i);
		}
		System.out.println(l);

//		List<Integer> eN = new ArrayList<Integer>();
//		for (Integer i : l) {
//			if (i % 2 == 0) {
//				eN.add(i);
//			}
//		}
//		System.out.println(eN);
		Predicate<Integer> p = i -> i % 2 == 0;
		List<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
		
		System.out.println("Count: " + l.stream().count());
		
		List<Integer> sortedList = l.stream().sorted().collect(Collectors.toList());
		System.out.println("Stream Sorted:- " + sortedList);

	}

}
