package Abstraction;

public class Test {

	public static void main(String[] args) {
		// BMW b = new BMW(); Cannot Instantiate an abstract class
		ThreeSeries s3 = new ThreeSeries();
		s3.accelerate();
		s3.commonFunc();
	}
}
