package java8Features.predicate.joins;

import java.util.function.Predicate;

public class PredicateJoinsDemo {

	public static void main(String[] args) {

		int[] x = { 0, 7, 10, 20, 30, 40, 50, 60, 70, 73 };

		Predicate<Integer> greaterThan10 = i -> i > 10;
		Predicate<Integer> isEven = i -> i % 2 == 0;

		System.out.println("Greater Than 10: ");
		method1(greaterThan10, x);

		System.out.println("Even Numbers");
		method1(isEven, x);

		System.out.println("Not Greater than 10");
		method1(greaterThan10.negate(), x);

		System.out.println("greater than 10 and even");

		method1(greaterThan10.negate().or(isEven.negate()), x);

	}

	static void method1(Predicate<Integer> p, int[] x) {
		for (int i : x) {
			if (p.test(i)) {
				System.out.println(i);
			}
		}
	}

}
