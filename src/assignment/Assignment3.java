package assignment;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int enteredNumber = sc.nextInt();
		
		boolean isPrime = true;

		for (int i = 2; i < enteredNumber / 2; i++) {
			if (enteredNumber % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Entered number is Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
