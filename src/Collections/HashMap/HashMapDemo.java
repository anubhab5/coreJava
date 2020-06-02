package Collections.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("John", 67);
		map.put("Mary", 54);
		map.put("Sam", 94);
		map.put("Tuli", 54);
		
		System.out.println(map);
		
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("Values: " + values);
		
		for (String key : keySet) {
			System.out.println("Key: " + key + " Value: " + map.get(key));
		}
		
	}

}
