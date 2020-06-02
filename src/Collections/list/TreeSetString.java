package Collections.list;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetString {

	public static void main(String[] args) {

		Set<String> treeSetList = new TreeSet<String>(new StringLengthComparator());
		treeSetList.add("zzz");
		treeSetList.add("ZZZZZ");
		treeSetList.add("ddddddd");
		treeSetList.add("ttttttttt");
		treeSetList.add("AAAAAAAAAAAAA");
		treeSetList.add("z");
		System.out.println(treeSetList);
	}

}
