package Collections.HashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new IdentityHashMap<Integer, String>();
		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);
		map.put(id1, "Sam");
		map.put(id2, "Tom");
		
		System.out.println(map);

	}

}
