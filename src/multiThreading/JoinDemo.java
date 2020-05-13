package multiThreading;

import java.util.Scanner;

public class JoinDemo extends Thread {

	static int n;
	static int sum = 0;

	public static void main(String[] args) {
		System.out.println("Sum of First n numbers");
		System.out.println("Enter A Number");
		Scanner sc = new Scanner(System.in);
		JoinDemo.n = sc.nextInt();

		JoinDemo jd = new JoinDemo();
		jd.start();

		try {
			jd.join();
		} catch (InterruptedException e) {
			System.out.println("Exception...");
		}

		System.out.println("Sum is " + JoinDemo.sum);
	}

	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Some Exception...");
			}
		}
	}
}
