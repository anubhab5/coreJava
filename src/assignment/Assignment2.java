package assignment;

public class Assignment2 {

	public static void main(String[] args) {
		int maths = 84;
		int physics = 63;
		int chemistry = 64;

		if (maths > 100 || physics > 100 || chemistry > 100) {
			System.out.println("Invalid Marks");
		} else {
			if (maths < 35 || physics < 35 || chemistry < 35) {
				if (maths < 35) {
					System.out.println("Failed In Maths");
				} else if (physics < 35) {
					System.out.println("Failed In Physics");
				} else {
					System.out.println("Failed In Chemistry");
				}
			} else {
				int avgMarks = 0;
				avgMarks = (maths + physics + chemistry) / 3;
				if (avgMarks >= 70) {
					System.out.println("Grade is A");
				} else if (avgMarks <= 69 && avgMarks > 59) {
					System.out.println("Grade is B");
				} else {
					System.out.println("Grade is C");
				}
			}
		}
	}
}
