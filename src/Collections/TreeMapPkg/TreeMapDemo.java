package Collections.TreeMapPkg;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("A", 101);
		tm.put("B", 102);
		tm.put("C", 103);
		tm.put("D", 104);
		tm.put("E", 105);
		
		System.out.println(tm);
		
		System.out.println("Floor Key:- "+ tm.floorKey("a"));
		System.out.println("Lower Key:- "+ tm.lowerKey("B"));
		System.out.println("Celing Key:- "+ tm.ceilingKey("B"));
		System.out.println("Higher Key:- "+ tm.higherKey("B"));
		System.out.println("Poll First Entry:- "+ tm.pollFirstEntry());
		System.out.println("Current Tree Map:- " + tm);
		System.out.println("Poll Last Entry:- "+ tm.pollLastEntry());
		System.out.println("Current Tree Map:- " + tm);
	}

}
