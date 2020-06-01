package Collections.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20); // Autoboxing
		list.add(new Integer(10));
		System.out.println(list);
	}
}
