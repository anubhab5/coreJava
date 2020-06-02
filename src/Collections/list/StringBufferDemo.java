package Collections.list;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferDemo {

	public static void main(String[] args) {

		Set<StringBuffer> list = new TreeSet<>(new SBComparator());
		
		list.add(new StringBuffer("abc"));
		list.add(new StringBuffer("def"));
		list.add(new StringBuffer("xyz"));
		list.add(new StringBuffer("sss"));
		
		for (StringBuffer item : list) {
			System.out.println(item);
		}
		
	}

}
