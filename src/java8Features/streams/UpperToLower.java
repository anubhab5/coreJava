package java8Features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLower {

	public static void main(String[] args) {

		List<String> s = new ArrayList<String>();
		
		s.add("JOHN");
		s.add("JIM");
		s.add("ANUBHAB");
		List<String> s2 = s.stream().map(s1-> s1.toLowerCase()).collect(Collectors.toList());
		System.out.println(s2);
	}

}
