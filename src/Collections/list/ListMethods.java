package Collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 10; i <= 100; i = i + 10) {
			list.add(i);
		}

		System.out.println("List: " + list);

		list.add(1, 99);
		System.out.println("List: " + list);

		list.set(3, 44);
		System.out.println("List: " + list);

		list.remove(0);
		System.out.println("List: " + list);

		/////////////////////////////////////////////////////

		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);

		System.out.println(secondList);

		list.addAll(2, secondList);
		System.out.println(list);

		for (Integer num : list) {
			System.out.println(num);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
