package Collections.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {

		Random obj = new Random();
		List<Integer> arrList = new ArrayList<Integer>();

		for (int i = 0; i <= 10; i++) {
			int number = obj.nextInt(12);
			arrList.add(number);
		}
		System.out.println(arrList);
		
		Set<Integer> set = new HashSet<Integer>(arrList);
		System.out.println(set);
		
	}
}
