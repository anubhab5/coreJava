package multiThreading;

public class multiThreaded extends Thread {

	public static void main(String[] args) {

		multiThreaded mt = new multiThreaded();
		mt.start();

		for (int j = 1; j <= 20; j++) {
			System.out.print("j: " + j + "\t");
		}
	}

	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("i: " + i + "\t");
		}
	}
}
