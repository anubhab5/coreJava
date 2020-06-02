package Collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20); // Autoboxing
		list.add(new Integer(10));
		System.out.println(list);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			if (itr.next() == 20) {
				itr.remove();
			}
		}
		System.out.println(list);
	}
}
