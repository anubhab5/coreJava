package assignment;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int enteredNumber = sc.nextInt();
		sc.close();
		Assignment4.forLoopDemoFn(enteredNumber);
		Assignment4.whileLoopDemo(enteredNumber);
		Assignment4.doWhileDemo(enteredNumber);

	}

	static void forLoopDemoFn(int num) {
		for (int i = 1; i <= num; i++) {
			if (i > 100) {
				System.out.println("Number is greater than 100");
				break;
			} else {
				if (i % 10 == 0) {
					continue;
				}
				System.out.println(i);
			}
		}
	}

	static void whileLoopDemo(int num) {
		int i = 1;
		while (i <= num) {
			if (i > 100) {
				System.out.println("Number is greater than 100");
				break;
			}
			if (i % 10 == 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

	static void doWhileDemo(int num) {
		int i = 1;

		do {
			if (i > 100) {
				System.out.println("Number is greater than 100");
				break;
			}
			if (i % 10 == 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		} while (i < num);
	}
}
