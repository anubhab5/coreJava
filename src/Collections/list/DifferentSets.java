package Collections.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {

		Random rand = new Random();

		// HashSet
		Set<Integer> hashSet = new HashSet<Integer>();
		
		// LinkedHashSet
		Set<Integer> linkedSet = new LinkedHashSet<Integer>();
		
		// TreeSet
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		for (int i = 1; i < 20; i++) {
			int number = rand.nextInt(100);			
			hashSet.add(number);
			linkedSet.add(number);
			treeSet.add(number);			
			System.out.println(number);
		}
		System.out.println(hashSet); // Random order 
		System.out.println(linkedSet); // The same order it was generated
		System.out.println(treeSet); // In Ascending order
		
		
	}

}
